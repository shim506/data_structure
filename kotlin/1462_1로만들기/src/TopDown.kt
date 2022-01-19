import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min


var dp = intArrayOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var num = readLine().toInt()

    dp = IntArray(num + 1) {
        if (it == 0 || it == 1) 0 else -1
    }
    println(recur(num))

}

fun recur(num: Int): Int {
    if (dp[num] != -1) return dp[num]
    else {
        var min = Int.MAX_VALUE

        if (num % 3 == 0) min = min(recur(num / 3) , min)
        if (num % 2 == 0) min = min(recur(num / 2) , min)
        min = min(recur(num - 1), min)

        dp[num] = min+1
        return dp[num]

    }

}


