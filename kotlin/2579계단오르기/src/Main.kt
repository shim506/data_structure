import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val arr = IntArray(N + 1) { 0 }

    val dp = IntArray(N + 1) { 0 }

    repeat(N) {
        arr[it + 1] = readLine().toInt()
    }

    dp[0] = arr[0]
    dp[1] = dp[0] + arr[1]
    dp[2] = dp[1] + arr[2]

    for (i in 3..N) {
        if (i < N ) {
            dp[i] = maxOf(
                dp[i - 3] + arr[i - 1] + arr[i],
                dp[i - 2] + arr[i],
                dp[i - 1]
            )
        } else {
            dp[i] = maxOf(
                dp[i - 3] + arr[i - 1] + arr[i],
                dp[i - 2] + arr[i]
            )
        }
    }
    println(dp.maxOrNull())


}