import java.io.BufferedReader
import java.io.InputStreamReader
/*

val N = readLine()!!.toInt()
val dp = Array<Array<Int?>>(N + 1) { Array<Int?>(10) { null } }

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    dp[1][0] = 0
    for (i in 1..9) {
        dp[1][i] = 1
    }
    var result = 0

    for (i in 0..9) {
        result += recur(N, i)!!
        result %= 1000000000
    }
    println(result)
}


fun recur(num: Int, valueIdx: Int): Int? {
    if (num == 1) {
        return dp[num][valueIdx]
    }
    if (dp[num][valueIdx] == null) {
        dp[num][valueIdx] =
            when (valueIdx) {
                0 -> recur(num - 1, 1)
                9 -> recur(num - 1, 8)
                else -> recur(num - 1, valueIdx - 1)!! + recur(num - 1, valueIdx + 1)!!
            }
    }
    return dp[num][valueIdx]!! % 1000000000
}*/