import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashMap

lateinit var array: Array<MutableList<Int>>
lateinit var isVisited: Array<Boolean>

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (N, M) = readLine().split(' ').map { it.toInt() }
    isVisited = Array(N + 1) { false }
    var resultCnt = 0

    array = Array<MutableList<Int>>(N + 1) { mutableListOf() }
    repeat(M.toInt()) {
        val (x, y) = readLine().split(' ').map { it.toInt() }
        array[x].add(y)
        array[y].add(x)
    }


    for (i in 1 until isVisited.size) {
        if (!isVisited[i]) {
            dfsNum(i)
            resultCnt++
        }
    }
    println(resultCnt)
}

fun dfsNum(startValue: Int) {
    isVisited[startValue] = true
    array[startValue].forEach {
        if (!isVisited[it]) {
            dfsNum(it)
        }
    }


}


