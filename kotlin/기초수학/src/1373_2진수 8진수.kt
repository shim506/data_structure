import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val binaryReversed = readLine()
    val binary = binaryReversed.reversed()

    val result = Array<Int>(1000000) { 0 }
    for (i in binary.indices) {
        if (binary[i] == '1') {
            var value = i
            var cnt = 0
            while (value > 2) {
                value -= 3
                cnt++
            }
            result[cnt] += (2.0).pow(value).toInt()
            if (result[cnt] >= 8){
                result[cnt+1]++
                result[cnt] -= 8
            }
        }
    }

    val sb = StringBuilder()
    result.forEach {
        if (it != 0) {
            sb.append(it.toString())
        }
    }

    val num = sb.reverse()
    val numStr = num.toString().trimStart('0')
    if (numStr.length == 0) println(0) else println(numStr)

}