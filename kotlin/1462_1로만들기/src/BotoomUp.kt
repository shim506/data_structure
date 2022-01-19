import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var num = readLine().toInt()

    var dp = IntArray(num + 1)

    for (i in 2..num) {
        dp[i] = dp[i - 1] + 1
        if (i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1)
        if (i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1)
    }
    println(dp[num])
}
