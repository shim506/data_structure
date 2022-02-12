import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

// 소문자 , 대문자 , 숫자 ,공백

    var line: String? = readLine()
    while (line != null) {
        var lowerCharCnt = 0
        var numberCnt = 0
        var upperCharCnt = 0
        var spaceCharCnt = 0

        line.forEach {
            when {
                it.isUpperCase() -> upperCharCnt++
                it.isLowerCase() -> lowerCharCnt++
                it == ' ' -> spaceCharCnt++
                it.isDigit() -> numberCnt++

            }
        }
        println("$lowerCharCnt $upperCharCnt $numberCnt $spaceCharCnt")
        line = readLine()
    }
}