import java.io.BufferedReader
import java.io.InputStreamReader

/*
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val dp = Array<Array<Int?>>(N + 1) { Array<Int?>(10) { null } }

    for (i in 0..9) {
        dp[1][i] = 1
    }

    for (i in 2..N) {
        for (j in 0..9) {
            dp[i][j] =
                if (j == 0) {
                    var result = 0
                    for (k in 0..9) {
                        result += dp[i - 1][k]!!% 10007
                        result %= 10007
                    }
                    result
                } else {
                    (dp[i][j - 1]!! - dp[i - 1][j - 1]!!) % 10007
                }

        }
    }

    var result = 0
    for (k in 0..9) {
        result += dp[N][k]!! % 10007
        result %= 10007
    }
    println(result)

}
*/

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val dp = Array<Array<Int?>>(N + 1) { Array<Int?>(10) { 0 } }

    for (i in 0..9) {
        dp[1][i] = 1
    }

    for (i in 2..N) {
        for (j in 0..9) {
            for (k in 0..j) {
                dp[i][j] = dp[i][j]!! + dp[i - 1][k]!!
                dp[i][j] = dp[i][j]!! % 10007
            }


        }
    }

    var result = 0
    for (k in 0..9) {
        result += dp[N][k]!! % 10007
        result %= 10007
    }
    println(result)

}