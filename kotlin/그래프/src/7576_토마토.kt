import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

lateinit var matrix7576: Array<Array<Int>>
val checkList = HashSet<String>()
var result = -1

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    // 1. 4방면을 살피는 부분에 대해서는 다른 코드의 참고가 필요하다
    // 2. 이미 거처간 곳을 hashSet 로 관리한다. (행렬 변호를 Stirng으로)
    // 3. bfs 로 구현하되 재귀적으로 한 턴을 마칠때마다 다음 Bfs를 새로운 queue 에 넣고 호출한다.

    val (col, row) = readLine().split(" ").map { it.toInt() }
    matrix7576 = Array<Array<Int>>(row) { Array<Int>(col) { 0 } }

    val firstQueue = LinkedList<Pair<Int, Int>>()
    // initialize
    for (i in 0 until row) {
        val st = StringTokenizer(readLine(), " ")
        for (j in 0 until col) {
            val value = st.nextToken().toInt()

            matrix7576[i][j] = value
            if (value == 1) firstQueue.add(Pair(i, j))
        }
    }
    bfs_7576(firstQueue)

    for (i in 0 until matrix7576.size) {
        for (j in 0 until matrix7576[0].size) {
            if (matrix7576[i][j] == 0) {
                println(-1)
                return
            }
        }
    }
    println(result)

}

// 전체를 탐색하지말고 어젯밤꺼만 따로 저장해놓는 방법을 쓰자
fun bfs_7576(queue: LinkedList<Pair<Int, Int>>) {
    result++

    val nextQueue = LinkedList<Pair<Int, Int>>()

    while (queue.isNotEmpty()) {
        val point = queue.poll()
        checkList.add(point.first.toString() + point.second.toString())

        try {
            if (matrix7576[point.first - 1][point.second] == 0) {
                matrix7576[point.first - 1][point.second] = 1
                nextQueue.add(Pair(point.first - 1, point.second))
            }
        } catch (e: Exception) {
        }

        try {
            if (matrix7576[point.first + 1][point.second] == 0) {
                matrix7576[point.first + 1][point.second] = 1
                nextQueue.add(Pair(point.first + 1, point.second))
            }
        } catch (e: Exception) {
        }

        try {
            if (matrix7576[point.first][point.second - 1] == 0) {
                matrix7576[point.first][point.second - 1] = 1
                nextQueue.add(Pair(point.first, point.second - 1))
            }
        } catch (e: Exception) {
        }
        try {
            if (matrix7576[point.first][point.second + 1] == 0) {
                matrix7576[point.first][point.second + 1] = 1
                nextQueue.add(Pair(point.first, point.second + 1))
            }
        } catch (e: Exception) {
        }
    }
    if (nextQueue.isEmpty()) {
        return
    } else {
        bfs_7576(nextQueue)
    }
}
