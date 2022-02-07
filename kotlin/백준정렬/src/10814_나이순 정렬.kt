import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val result = arrayListOf<Pair<Int, String>>()

    repeat(N) {
        val xy = readLine().split(" ")
        result.add(Pair(xy[0].toInt(), xy[1]))
    }

    result.sortBy { it.first }


    result.forEach { println("${it.first} ${it.second}") }

}