import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine(), " ")

    val minimum = st.nextToken().toInt()
    val maximum = st.nextToken().toInt()

    for (i in minimum..maximum) {
        if (isSosu(i)) println(i)
    }

}

fun isSosu(value: Int): Boolean {
    if (value == 2) return true
    else if (value == 1) return false
    for (i in 2..sqrt(value.toDouble()).toInt() + 1) {
        if (value % i == 0) return false
    }
    return true

}


