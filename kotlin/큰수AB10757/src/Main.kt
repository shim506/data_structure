import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import javax.xml.stream.events.Characters

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine(), " ")

    var num1 = st.nextToken()
    var num2 = st.nextToken()
    val result = mutableListOf<String>()
    var carry = 0


    while (num1.isNotEmpty() || num2.isNotEmpty()) {

        var bitA = 0
        var bitB = 0

        if (num1.isNotEmpty()) {
            bitA = num1.substring(num1.lastIndex).toInt()
            num1 = num1.substring(0, num1.lastIndex)
        }
        if (num2.isNotEmpty()) {
            bitB = num2.substring(num2.lastIndex).toInt()
            num2 = num2.substring(0, num2.lastIndex)
        }

        val tempResult = bitA + bitB + carry

        result.add((tempResult % 10).toString())

        carry = if (tempResult > 9) 1 else 0
    }
    if (carry == 1) {
        result.add("1")
    }

    result.reversed().forEach {
        print(it)
    }

}