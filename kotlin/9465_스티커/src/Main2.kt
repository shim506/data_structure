import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val T = readLine().toInt()

// 해당위치까지 올 수 있는 값들을 누적하여 해당 위의 값을 결정한다.
    repeat(T) {

        val N = readLine().toInt()
        val arr = Array<Array<Int>>(2) { Array<Int>(N + 1) { 0 } }
        val dp = Array<Array<Int>>(2) { Array<Int>(N + 1) { 0 } }

        for (i in 0..1) {
            var st = StringTokenizer(readLine(), " ")
            for (j in 1..N) {
                arr[i][j] = st.nextToken().toInt()
            }
        }

        for (i in 1..N) {
            dp[1][i] = arr[1][i] + maxOf(dp[0][i - 1], dp[0][i - 2])
            dp[0][i] = arr[0][i] + maxOf(dp[1][i - 1], dp[1][i - 2])
        }

        println(max(dp[0][N], dp[1][N]))
    }


}