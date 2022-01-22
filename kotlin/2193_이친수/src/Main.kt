import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()

    val dp = Array<Long?>(N + 1) { null }

    dp[0] = 0
    dp[1] = 1

    for (i in 2..N) {
        dp[i] = dp[i - 1]!! + dp[i - 2]!!
    }
    println(dp[N])


}