import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    repeat(N) {
        val inputList = readLine().split(" ").map { it.toInt() }
        var sum = 0
        for (i in inputList.indices) {
            for (j in i + 1 until inputList.size) {

                val gcd = GCD(inputList[i], inputList[j])
                sum += gcd
            }
        }
        println(sum)
    }
}

