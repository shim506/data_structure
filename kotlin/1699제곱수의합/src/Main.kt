import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    var N = readLine().toInt()
    val dp = Array<Int>(N + 1) { 0 }


    for (i in 1..N) {
        dp[i] = i
        for (j in 0 .. sqrt(i.toDouble()).toInt()) {
            dp[i] = minOf(dp[i], dp[i - j * j] + 1)
        }

    }
    println(dp[N])
}

