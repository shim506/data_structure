import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    repeat(N) {
        val inputList = readLine().split(" ").map { it.toInt() }

        //println(GCD(inputList[0], inputList[1]))
       println(LCM(inputList[0], inputList[1]))

    }
}

tailrec fun GCD(x: Int, y: Int): Int {
    val remain = x % y
    if (remain == 0) return y
    return GCD(y, remain)
}

fun LCM(x: Int, y: Int): Int {

    return x * (y / GCD(x, y))
}

