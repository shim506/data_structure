import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine(), " ")

    val A = st.nextToken().toInt()
    val B = st.nextToken().toInt()

    val N = readLine().toInt()

    st = StringTokenizer(readLine(), " ")
    var decimalResult = 0
    repeat(N) {
        val num = st.nextToken().toInt()
        decimalResult += (A.toDouble().pow(N - it - 1)).toInt() * num
    }

    val result = mutableListOf<Int>()
    while (decimalResult != 0) {
        result.add(decimalResult % B)
        decimalResult /= B
    }

    result.reverse()
    result.forEach {
        print("$it ")
    }

}

