import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()


    var result = mutableListOf<Int>()
    var lst = Array<Boolean>(N) { true }

    var count = -1
    var lstIdx = -1

    while (result.size < N) {

        lstIdx++

        if (lst[lstIdx]) {
            count++
        }

        if (count == K - 1) {
            lst[lstIdx] = false
            result.add(lstIdx + 1)
            count = -1
        }
        if (lstIdx == N - 1) {
            lstIdx = -1
        }

    }

    val sb = StringBuilder()
    sb.append('<')
    result.forEach { sb.append("$it, ") }
    sb.deleteCharAt(sb.lastIndex).deleteCharAt(sb.lastIndex)
    sb.append('>')
    println(sb)

}