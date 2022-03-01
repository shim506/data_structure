import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


lateinit var houseMatrix: Array<Array<Boolean>>
var N: Int = 0
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    N = readLine().toInt()
    houseMatrix = Array(N + 1) { Array(N + 1) { false } }
    val resultList = mutableListOf<Int>()

    // 초기화
    repeat(N) {
        val data = readLine()
        for (i in 0 until N) {
            houseMatrix[it + 1][i + 1] = data[i] != '0'
        }
    }

    for (i in 1..N) {
        for (j in 1..N) {
            if (houseMatrix[i][j]) {
                resultList.add(bfs_2667(i, j))
            }
        }
    }

    println(resultList.size)
    resultList.sorted().forEach { println(it) }
}

fun bfs_2667(i: Int, j: Int): Int {
    val queue = LinkedList<Pair<Int, Int>>()

    queue.add(Pair(i, j))
    houseMatrix[i][j] = false

    var result = 1
    while (queue.isNotEmpty()) {
        val pos = queue.poll()

        val left = Pair(pos.first, pos.second - 1)
        val right = Pair(pos.first, pos.second + 1)
        val up = Pair(pos.first + 1, pos.second)
        val down = Pair(pos.first - 1, pos.second)

        if (left.second > 0 && houseMatrix[left.first][left.second]) {
            queue.add(left)
            result++
            houseMatrix[left.first][left.second] = false
        }
        if (right.second < N + 1 && houseMatrix[right.first][right.second]) {
            queue.add(right)
            result++
            houseMatrix[right.first][right.second] = false
        }
        if (up.first < N + 1 && houseMatrix[up.first][up.second]) {
            queue.add(up)
            result++
            houseMatrix[up.first][up.second] = false
        }
        if (down.first > 0 && houseMatrix[down.first][down.second]) {
            queue.add(down)
            result++
            houseMatrix[down.first][down.second] = false
        }
    }
    return result

}

