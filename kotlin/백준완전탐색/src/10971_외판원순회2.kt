import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.min

val matrix = mutableListOf<MutableList<Int>>()
var result = Int.MAX_VALUE
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    repeat(num) {
        val row = mutableListOf<Int>()
        row.addAll(readLine().split(" ").map { it.toInt() })
        matrix.add(row)
    }

    for (i in 0 until num) {
        val hashMap = hashMapOf<Int, Int>()
        hashMap[i] = 0
        dfs10971(i, i, hashMap, num)
    }
    println(result)
}

fun dfs10971(startIdx: Int, nowIdx: Int, hashMap: HashMap<Int, Int>, num: Int) {
    if (hashMap.size == num) {
        var totalValue = hashMap.values.sum()
        if (matrix[nowIdx][startIdx] != 0) {
            totalValue += matrix[nowIdx][startIdx]
            result = kotlin.math.min(totalValue, result)
        }

    } else {
        for (i in 0 until num) {
            if (matrix[nowIdx][i] != 0 && !hashMap.contains(i)) {
                val newHashMap = hashMapOf<Int, Int>()
                newHashMap.putAll(hashMap)
                newHashMap[i] = matrix[nowIdx][i]
                dfs10971(startIdx, i, newHashMap, num)
            }
        }
    }
}
