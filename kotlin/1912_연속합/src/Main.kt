import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val arr = readLine().split(" ").map { it.toInt() }
    if (arr.filter { it < 0 }.count() == N) {
        println(arr.maxOrNull())
    } else {
        val dp = IntArray(N) { 0 }
        dp[0] = arr[0]
        for (i in 1 until N) {

            dp[i] = when {
                arr[i] > 0 -> dp[i - 1] + arr[i]
                dp[i - 1] + arr[i] > 0 -> dp[i - 1] + arr[i]
                else -> 0
            }
        }
        println(dp.maxOrNull())
    }

}