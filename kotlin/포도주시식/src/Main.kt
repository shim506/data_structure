import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val arr = Array<Int>(N + 1) { 0 }
    val dp = Array<Int>(N + 1) { 0 }

    repeat(N) {
        arr[it + 1] = readLine().toInt()
    }

    if (N >= 1) dp[1] = arr[1]
    if (N >= 2) dp[2] = arr[2] + arr[1]


    for (i in 3..N) {
        dp[i] = max(max(dp[i - 1], dp[i - 2] + arr[i]), dp[i - 3] + arr[i - 1] + arr[i])
    }
    println(dp.maxOrNull())

}