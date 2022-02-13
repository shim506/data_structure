import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

// 소문자 , 대문자 , 숫자 ,공백

    var numList = readLine().split(" ")
    val ab = numList[0] + numList[1]
    val cd = numList[2] + numList[3]

    println((ab.toLong() + cd.toLong()))


}