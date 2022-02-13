import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var word = readLine()

    var tailList = mutableListOf<String>()
    for (i in word.indices) {

        tailList.add(word.substring(i))
    }

    tailList.sort()
    tailList.forEach {
        println(it)
    }

}