import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    var arr = mutableListOf<Int>()

    repeat(N) {
        arr.add(readLine().toInt())
    }
    arr.sort()
    var sb = StringBuilder()

    arr.forEach { sb.append("$it\n") }

    println(sb.toString())
    // System.out.bufferedWriter().write(sb.toString())


}