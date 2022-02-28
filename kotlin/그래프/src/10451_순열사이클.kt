import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


lateinit var checkedArray: Array<Boolean>
lateinit var vertexMatrix: Array<Int>
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    // 1부터 시작하는 거 잊지말고~
    val N = readLine().toInt()
    repeat(N) {
        val num = readLine().toInt()

        checkedArray = Array(num + 1) { false }
        vertexMatrix = Array(num+ 1) { -1 }

        val st = StringTokenizer(readLine(), " ")

        repeat(num) { index ->
            vertexMatrix[index + 1] = st.nextToken().toInt()
        }

        var resultCount = 0

        for (i in 1 until checkedArray.size) {
            if (!checkedArray[i]) {
                resultCount++
            }
            dfs_10451(i)
        }
        println(resultCount)
    }
}

fun dfs_10451(i: Int) {
    checkedArray[i] = true
    if (!checkedArray[vertexMatrix[i]]) dfs_10451(vertexMatrix[i]) else return
}

