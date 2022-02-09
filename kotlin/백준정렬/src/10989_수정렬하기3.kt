import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    val result = Array<Int>(10001) { 0 }
    val bufferedWriter = System.out.bufferedWriter()

    var maxValue = 0
    repeat(N) {
        val num = readLine().toInt()
        maxValue = maxOf(maxValue, num)
        result[num] += 1
    }


    result.forEachIndexed() { index, i ->
        repeat(i) {
           bufferedWriter.write("$index\n")
        }
        if (index == maxValue) {
            return@forEachIndexed
        }
    }
    bufferedWriter.flush()
    bufferedWriter.close()

}