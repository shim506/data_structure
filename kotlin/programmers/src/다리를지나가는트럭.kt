import java.util.LinkedList

fun main() {
    val sol = Solution()
    println(sol.solution(2, 10, intArrayOf(7, 4, 5, 6)))

}
class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val waitQueue = LinkedList<Int>()
        val runningMap= hashMapOf<Int , MutableList<Int>>()

        for(i in truck_weights.indices){

        }
        runningMap.values.sumOf { it.sum() }



        return answer
    }
}