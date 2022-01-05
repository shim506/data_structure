import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()

    repeat(num) {
        val (iter:String , str:String) = readLine().split(' ')
        var result =""

        str.toCharArray().forEach {
            val char = it
            repeat(iter.toInt()){
                result += char
            }
        }
        println(result)
    }
}