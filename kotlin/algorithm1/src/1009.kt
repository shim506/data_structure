import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    repeat(N) {
        val st = StringTokenizer(readLine(), " ")
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        var result = 1
        repeat(b) {
            result = result * a % 10
        }
        if (result == 0) {
            result = 10
        }
        println(result)
    }
}