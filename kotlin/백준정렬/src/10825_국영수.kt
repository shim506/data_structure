import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val result = arrayListOf<Pair<String, List<Int>>>()

    repeat(N) {
        val xy = readLine().split(" ")
        result.add(Pair(xy[0], listOf<Int>(xy[1].toInt(), xy[2].toInt(), xy[3].toInt())))
    }


    // 조건에 따라 정렬하는 것이 더 효율적이겠다.

    /*
    result.sortBy { it.first }
    result.sortByDescending { it.second[2] }
    result.sortBy { it.second[1] }
    result.sortByDescending { it.second[0] }
    */

    result.sortWith(compareBy({ -it.second[0] }, { it.second[1] }, { -it.second[2] }, { it.first }))


    result.forEach { println("${it.first}") }

}
