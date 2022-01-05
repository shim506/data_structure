import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

// 1076

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
/*
    val colorMap = hashMapOf<String, Int>()

    colorMap["black"] = 0
    colorMap["brown"] = 1

    colorMap["red"] = 2
    colorMap["orange"] = 3

    colorMap["yellow"] = 4
    colorMap["green"] = 5

    colorMap["blue"] = 0
    colorMap["violet"] = 1

    colorMap["grey"] = 0
    colorMap["white"] = 1
*/
    val colorArray = arrayOf<String>(
        "black",
        "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
    )

    var result: Long = 0


    var num1 = colorArray.indexOf(readLine()) * 10
    var num2 = colorArray.indexOf(readLine())
    var num3 = colorArray.indexOf(readLine())

    result = (num1 + num2).toLong() * 10.0.pow(num3).toLong()

    //val br = System.`in`.bufferedReader()


    println(result)
}