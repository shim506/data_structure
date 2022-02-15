import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine(), " ")

    var value = st.nextToken().toLong()
    val N = st.nextToken().toInt()


    val result = mutableListOf<Int>()
    while (value != 0L) {
        val remain = value % N
        value /= N
        result.add(remain.toInt())
    }

    //println(result)

    val sb = StringBuilder()
    result.reverse()
    result.forEach {
        if (it >= 10) {
            sb.append('A' + it - 10)
        } else {
            sb.append(it)
        }
    }
    println(sb)
}

