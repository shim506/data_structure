import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val hashMap = HashMap<Int, MutableList<Int>>()
    //val keyList = mutableListOf<Int>()

    repeat(N) {
        val xy = readLine().split(" ").map { it.toInt() }
        if (hashMap[xy[0]] == null){hashMap[xy[0]]= mutableListOf<Int>(xy[1])} else  hashMap[xy[0]]?.add(xy[1])
    }


    var count = 0
    for (i in -100000..100000) {
        if (hashMap.containsKey(i)) {
            hashMap[i]!!.sort()
            hashMap[i]!!.forEach {
                println("$i $it")
                count++
            }

        }
        if (count == N) {
            break
        }
    }

}