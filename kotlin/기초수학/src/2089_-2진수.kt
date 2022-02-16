import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var value = readLine().toLong()
    var result = mutableListOf<Int>()


    while (value != 0L) {
        var remain = 0
        if (value % -2 < 0) {
            remain = 1
            value--
        } else {
            remain = (value % -2)
        }
        value /= -2
        result.add(remain)
    }

    if (result.size != 0) {
        result.reverse()
        result.forEach { print(it) }
    } else {
        println(0)
    }

}