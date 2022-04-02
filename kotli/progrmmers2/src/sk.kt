import java.util.LinkedList

fun main() {
    val sol = Solution()
    val lst = Array<String>(6) { " " }

    lst[0] = "read 1 3 1 2"
    lst[1] = "read 2 6 4 7"
    lst[2] = "write 4 3 3 5 2"
    lst[3] = "read 5 2 2 5"
    lst[4] = "write 6 1 3 3 9"
    lst[5] = "read 9 1 0 7"

    val x = arrayListOf<String>("1", "2", "4", "3", "3", "4", "1", "5")
    val result = sol.solution(x.toArray(arrayOfNulls<String>(x.size)), lst)
   // result.forEach { println(it) }
}

class Solution {
    var runningQueue = LinkedList<Process>()
    var writeWaitingQueue = LinkedList<Process>()
    var readWaitingQueue = LinkedList<Process>()

    fun solution(arr: Array<String>, processes: Array<String>): Array<String> {
        var answer = mutableListOf<String>()

        var myArr = arr
        var time = 0

        // 데이터 자료형 생성및 초기화
        var processList = mutableListOf<Process>()
        processes.forEach {
            val processArr = it.split(" ")
            val isRead = processArr[0] == "read"
            if (isRead) {
                val process = Process(
                    isRead,
                    myToInt(processArr[1]),
                    myToInt(processArr[2]),
                    myToInt(processArr[3]),
                    myToInt(processArr[4])
                )
                processList.add(process)
            } else {
                val process = Process(
                    isRead,
                    myToInt(processArr[1]),
                    myToInt(processArr[2]),
                    myToInt(processArr[3]),
                    myToInt(processArr[4]),
                    myToInt(processArr[5])
                )
                processList.add(process)
            }
        }

        // 제일 먼저 시작하는 프로세스로 초기화
        val firstTime = processes[0].split(" ")[1]
        time = myToInt(firstTime)

        processList.forEach {
            if (it.startTime == time) {
                if (it.isReading) {
                    readWaitingQueue.add(it)
                } else {
                    writeWaitingQueue.add(it)
                }
            }
        }
        readWaitingQueue.forEach {
            processList.remove(it)
        }
        writeWaitingQueue.forEach {
            processList.remove(it)
        }

        if (writeWaitingQueue.isNotEmpty()) {
            runningQueue.add(writeWaitingQueue.poll())
        } else if (readWaitingQueue.isNotEmpty()) {
            while (readWaitingQueue.isNotEmpty()) {
                runningQueue.add(readWaitingQueue.poll())
            }
        }

        while (runningQueue.isNotEmpty() || writeWaitingQueue.isNotEmpty() || readWaitingQueue.isNotEmpty()) {
            val finishList = mutableListOf<Process>()
            runningQueue.forEach {
                it.duration--
                if (it.duration == 0) {
                    finishList.add(it)
                }
            }
            finishList.forEach {
                runningQueue.remove(it)
                //쓰기 및 읽기 실힝
                if (it.isReading) {
                    val st = java.lang.StringBuilder()
                    for (i in it.startIdx..it.endIdx) {
                        st.append((arr[i]).toString())
                    }
                    answer.add(st.toString())
                } else {
                    for (i in it.startIdx..it.endIdx) {
                        myArr[i] = it.ch.toString()
                    }
                }
            }
            // running 을 새롭게 초기화
            if (runningQueue.isEmpty()) {
                //runningQueue 변경
                runningQueue.poll()
                if (writeWaitingQueue.isNotEmpty()) {
                    runningQueue.add(writeWaitingQueue.poll())
                } else {
                    runningQueue.addAll(readWaitingQueue)
                    readWaitingQueue.clear()
                }
            } else if (runningQueue.peek().isReading && writeWaitingQueue.isEmpty()) {
                runningQueue.addAll(readWaitingQueue)
                readWaitingQueue.clear()
            } else {
                runningQueue.add(writeWaitingQueue.poll())
            }
            // 대기큐 추가
            processList.forEach {
                if (it.startTime == time - 1) {
                    if (it.isReading) readWaitingQueue.add(it) else writeWaitingQueue.add(it)
                }
            }
            readWaitingQueue.forEach {
                processList.remove(it)
            }
            writeWaitingQueue.forEach {
                processList.remove(it)
            }

            time++
        }

        answer.add(time.toString())
        return answer.toTypedArray()
    }

    private fun myToInt(strInt: String): Int {
        return if (strInt.length > 1) strInt.toInt() else Character.getNumericValue((strInt[0]))
    }
}

data class Process(
    val isReading: Boolean,
    val startTime: Int,
    var duration: Int,
    val startIdx: Int,
    val endIdx: Int,
    val ch: Int = -1
)

