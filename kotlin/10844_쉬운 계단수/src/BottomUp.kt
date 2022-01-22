import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = kotlin.io.readLine()!!.toInt()
    val dp = Array<Array<Int?>>(N + 1) { Array<Int?>(10) { null } }

    dp[1][0] = 0
    for (i in 1..9) {
        dp[1][i] = 1
    }
    var result = 0

    for (i in 2..N) {
        for (j in 0..9) {
            dp[i][j] =
                if (j == 0) {
                    dp[i - 1][1]
                } else (if (j == 9) {
                    dp[i - 1][8]
                } else {
                    dp[i - 1][j - 1]!! + dp[i - 1][j + 1]!!
                })!! %1000000000
        }
    }
    for (i in 0..9) {
        result += dp[N][i]!!
        result %= 1000000000
    }
    println(result)
}
