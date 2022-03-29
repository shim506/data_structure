import java.util.LinkedList


fun main() {
    val solution = Solution네트워크()
    var arr = Array<IntArray>(3) { IntArray(3) }
    arr[0] = intArrayOf(1, 1, 0)
    arr[1] = intArrayOf(1, 1, 0)
    arr[2] = intArrayOf(0, 0, 1)
    println(solution.solution(3, arr))

}

class Solution네트워크 {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        // 자기자신 말고 1인점을 찾는다
        // 1인점에에 대하여 BFS 로 0으로 만든다

        for (i in computers.indices) {
            for (j in computers[0].indices) {
                if (computers[i][j] == 1) {
                    bfs(Pair(i, j), computers)
                    answer++
                }
            }
        }
        return answer
    }

    private fun bfs(pair: Pair<Int, Int>, computers: Array<IntArray>) {
        val queue = LinkedList<Pair<Int, Int>>()
        queue.add(pair)

        while (queue.isNotEmpty()) {
            val point = queue.poll()
            computers[point.first][point.second] = 0
            computers[point.second][point.first] = 0

            // 출발노드 검사
            for (i in computers.indices) {
                if (computers[point.first][i] == 1) {
                    queue.add(Pair(point.first, i))
                }
            }

            // 도착 노드 검사
            for (i in computers.indices) {
                if (computers[point.second][i] == 1) {
                    queue.add(Pair(point.second, i))
                }
            }
        }
    }
}