import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()

    val person = mutableListOf<Pair<Int, Int>>()


    repeat(N) {
        val st = StringTokenizer(readLine(), " ")
        person.add(Pair(st.nextToken().toInt(), st.nextToken().toInt()))
    }

    for (i in 0 until person.size ) {
        var rank = 1
        for (j in 0 until person.size) {
            if ((person[i].first < person[j].first) && (person[i].second < person[j].second)) {
                rank++
            }
        }
        println(rank)
    }

}