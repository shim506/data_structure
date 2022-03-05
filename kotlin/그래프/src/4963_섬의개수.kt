import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.IndexOutOfBoundsException
import java.util.*

lateinit var array4963: Array<Array<Boolean>>

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val resultList = mutableListOf<Int>()

    while (true) {
        val (width, height) = readLine().split(' ').map { it.toInt() }
        if (width == 0 && height == 0) break

        array4963 = Array<Array<Boolean>>(height + 1) { Array<Boolean>(width + 1) { false } }

        //initialize
        for (i in 1..height) {
            var st = StringTokenizer(readLine(), " ")
            for (j in 1..width) {
                val value = st.nextToken().toInt() == 1
                array4963[i][j] = value
            }
        }
        var resultCount = 0

        for (i in 1..height) {
            for (j in 1..width) {
                if (array4963[i][j]) {
                    bfs_4963(i, j, width, height)
                    resultCount++
                }
            }
        }

        resultList.add(resultCount)
    }
    resultList.forEach {
        println(it)
    }

}

fun bfs_4963(i: Int, j: Int, width: Int, height: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(i, j))

    while (queue.isNotEmpty()) {
        val pos = queue.poll()

        for (u in pos.first - 1..pos.first + 1) {
            for (v in pos.second - 1..pos.second + 1) {
                try {
                    if (array4963[u][v]) queue.add(Pair(u, v))
                    array4963[u][v] = false
                } catch (e: IndexOutOfBoundsException) {
                    continue
                }
            }
        }
    }

}


fun printArray(array: Array<Array<Boolean>>) {
    for (i in 1..array.size) {
        for (j in 1..array[0].size) {
            print("${array[i][j]} ")
        }
        println()
    }
    println()
    println()
}
