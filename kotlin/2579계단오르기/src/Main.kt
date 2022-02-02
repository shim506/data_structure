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

    for (i in 0..N) {
        when (i) {
            0 -> dp[i] = 0
            1 -> dp[i] = arr[1]
            2 -> dp[i] = arr[1] + arr[2]
            else ->
                dp[i] = maxOf(
                    dp[i - 3] + arr[i - 1] + arr[i],
                    dp[i - 2] + arr[i]
                )
        }
    }
    println(dp[N])
}