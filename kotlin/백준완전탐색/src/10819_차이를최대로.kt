import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.util.*
import kotlin.math.abs

val totalList = mutableListOf<MutableList<Int>>()
val mutableList = mutableListOf<Int>()
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()

    if (num != 0) {
        val st = StringTokenizer(readLine(), " ")
        repeat(num) {
            mutableList.add(st.nextToken().toInt())
        }
    }

    dfs10819(num, mutableListOf<Int>())
    var maxVal = Int.MIN_VALUE
    totalList.forEach {
        val diff = calcDiff(it)
        maxVal = max(maxVal, diff)
    }
    println(maxVal)
}

fun calcDiff(list: MutableList<Int>): Int {
    var totalValue = 0
    for (i in 0..list.size - 2) {
        totalValue += abs(mutableList[list[i]] - mutableList[list[i + 1]])
    }
    return totalValue
}

fun dfs10819(num: Int, list: MutableList<Int>) {
    if (list.size == num) {
        totalList.add(list)
    } else {
        for (i in 0 until num) {
            if (!list.contains(i)) {
                val newList = mutableListOf<Int>()
                newList.addAll(list)
                newList.add(i)
                dfs10819(num, newList)
            }
        }
    }
}
