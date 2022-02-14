import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import kotlin.math.abs


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val x = readLine().split(" ").map { it.toLong() }

    val sb = StringBuilder()
    val N = abs(x[0] - x[1]).toInt()
    repeat(N) {
        sb.append("1")
    }
    val bf = BufferedWriter(OutputStreamWriter(System.out))
    bf.write(sb.toString())
    bf.flush()
    bf.close()

}


