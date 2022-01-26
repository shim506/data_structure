import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val arr = readLine().split(" ").map { it.toInt() }

    val dp = IntArray(N) { 1 }

    for (i in 1 until N) {

        for (j in 0 until i) {
            if (arr[j] < arr[i]) dp[i] = max(dp[i], dp[j] + 1)
        }


    }
    println(dp.maxOrNull())


}