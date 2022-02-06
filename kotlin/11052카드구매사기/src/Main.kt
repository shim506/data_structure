import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.pow

/*
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = Array<Int>(N + 1) { 0 }

    dp[1] = arr[0]
    if (N > 1) {
        dp[2] = max(arr[0] * 2, arr[1])
    }
    if (N > 2) {
        for (i in 3..N) {
            var maxValue = Int.MIN_VALUE
            for (j in 1..i / 2) {
                maxValue = max(maxValue, dp[j] + dp[i - j])
            }
            dp[i] = max(arr[i - 1], maxValue)
        }
    }
    //dp.forEach { println(it) }
    println(dp[N])
}
*/
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = Array<Int>(N + 1) { 0 }

    dp[1] = arr[0]

    for (i in 2..N) {

        for (j in 1..i) {
            dp[i] = max(dp[i - j] + arr[j-1], dp[i])
        }

    }

    //dp.forEach { println(it) }
    println(dp[N])
}
