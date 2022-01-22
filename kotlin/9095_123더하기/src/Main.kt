import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()


    val dp = Array<Int>(12) { -1 }
    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..11) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }
    repeat(N) {
        val number = readLine().toInt()
        println(dp[number])
    }
}