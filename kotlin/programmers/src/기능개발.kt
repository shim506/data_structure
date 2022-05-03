import java.util.LinkedList
import java.util.*

fun main() {
    // 큐 형태로 + Pair
    val sol = Solution기능개발()

    val ans = sol.solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))
    ans.forEach { println(it) }
}

class Solution기능개발{

    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var queue = LinkedList<Pair<Int, Int>>()
        for (i in progresses.indices) {
            queue.add(Pair(progresses[i], speeds[i]))
        }

        while (!queue.isEmpty()) {
            val tempQueue = LinkedList<Pair<Int, Int>>()
            queue.forEach {
                tempQueue.add(Pair(it.first + it.second, it.second))
            }
            queue = tempQueue
            var count = 0

            while (!queue.isEmpty()) {
                if (queue.peek().first >= 100) {
                    count++
                    queue.poll()
                } else break
            }
            if (count != 0) answer.add(count)
        }
        return answer.toIntArray()
    }

    companion object {
        const val MAX_NUM = 100
    }
}