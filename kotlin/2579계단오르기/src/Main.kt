import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val arr = IntArray(N + 1) { 0 }

    val dp = IntArray(N + 1) { 0 }

    dp[0] = arr[0]

    repeat(N) {
        arr[it + 1] = readLine().toInt()
    }


    for (i in 1..N) {

        if (i <= N - 3) {
            dp[i] = maxOf(
                dp[i - 3] + arr[i - 2] + arr[i - 1],
                dp[i - 3] + arr[i - 2] + arr[i],
                dp[i - 3] + arr[i] + arr[i - 1]
            )
        }
        else{
            dp[i] = maxOf(
                dp[i - 3] + arr[i - 2] + arr[i],
                dp[i - 3] + arr[i] + arr[i - 1]
            )
        }


    }
    println(dp.maxOrNull())


}