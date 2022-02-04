import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = Array<Long>(N) { 0 }
    val dp = Array<Long>(101) { 0 }

    repeat(N) {
        arr[it] = readLine().toLong()
    }

    dp[1] = 1
    dp[2] = 1
    dp[3] = 1
    dp[4] = 2
    dp[5] = 2
    dp[6] = 3


    for (i in 7..100) {
        dp[i] = dp[i - 1] + dp[i - 5]
    }


    arr.forEach { println(dp[it.toInt()]) }
}