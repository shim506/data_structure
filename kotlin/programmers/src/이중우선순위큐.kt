import java.util.PriorityQueue
import java.util.Collections
import java.util.HashMap


class Solution이중우선순위큐 {
    // 최대힙과 최소힙 두개를 관리한다.
    // 최후에는 두개의 중복 값을 통해 리스트를 완성한다
    fun solution(operations: Array<String>): IntArray {
        var answer = mutableListOf<Int>()

        val minQueue = PriorityQueue<Int>()
        val maxQueue = PriorityQueue<Int>(Collections.reverseOrder())


        operations.forEach {
            val input = it.split(" ")
            if (input[0] == "I") {
                minQueue.add(input[1].toInt())
            } else if (input[1] == "1") {
                maxQueue.poll()
            } else minQueue.poll()
        }

        answer.addAll(minQueue.filter { maxQueue.contains(it) })
        
        return answer.toIntArray()
    }
}