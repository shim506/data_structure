import java.io.*
import java.util.*
import kotlin.collections.HashMap


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val word = readLine().toCharArray()
    var map = mutableMapOf<Char, Int>()
    word.forEach {
        if (map.contains(it.toUpperCase())) {
            map[it.toUpperCase()] = map.get(it.toUpperCase())!! + 1
        } else {
            map[it.toUpperCase()] = 1
        }
    }
    val max = map.maxByOrNull { it.value }

    if (map.filter { it.value == max!!.value }.count() > 1) {
        println("?")
    } else {
        println(max!!.key)
    }


}