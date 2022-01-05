import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        val wordList = readLine().split(' ')
        wordList.forEach {
            print(it.reversed() + " ")
        }
        println()
    }
}