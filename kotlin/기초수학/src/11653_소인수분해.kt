import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var num = readLine().toInt()

    val result = mutableListOf<Int>()

    while (num != 1) {
        loop@ for (i in 2..num)
            if (num % i == 0) {
                result.add(i)
                num /= i
                break@loop
            }

    }

    result.sort()
    result.forEach {
        println(it)
    }

}