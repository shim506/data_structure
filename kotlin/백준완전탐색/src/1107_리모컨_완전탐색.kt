import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.abs
import kotlin.math.min

const val MAX_NUM = 999999
const val MIN_NUM = 0
var targetChannel: Int = 0
val errorSet = hashSetOf<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    targetChannel = readLine().toInt()
    val errorCount = readLine().toInt()

    if (errorCount != 0) {
        val st = StringTokenizer(readLine(), " ")
        repeat(errorCount) {
            errorSet.add(st.nextToken().toInt())
        }
    }
    var result = Int.MAX_VALUE
    loop@ for (i in MIN_NUM..MAX_NUM) {
        for (j in i.toString().indices) {
            val value = (i.toString()[j] - '0')
            if (errorSet.contains(value)) {
                continue@loop
            }
        }
            result = min(abs(targetChannel - i) + i.toString().length, result)
    }
    println(min(result,abs(targetChannel - 100)))
}