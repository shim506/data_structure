import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val word = readLine()
    val arr = Array<Int>(26) { 0 }

    word.forEach {
        arr[it - 'a']++
    }

    arr.forEach { print("$it ") }

}