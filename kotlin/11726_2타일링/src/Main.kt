import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    if (n <= 3) {
        println(n)
    } else {
        val dp = IntArray(n + 1)
        for (i in 0..2) {
            dp[i] = i
        }
        if (n >= 3) {
            for (i in 3..n) {
                dp[i] = (dp[i - 1] + dp[i - 2])%10007
            }
        }
        println(dp[n] )
    }
}