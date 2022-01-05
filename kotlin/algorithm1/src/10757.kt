import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*
import javax.xml.stream.events.Characters

// 1052
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine(), " ")

    var num1Sb = StringBuilder(st.nextToken())
    var num2Sb = StringBuilder(st.nextToken())

    var resultBilder = StringBuilder()

    var len1 = num1Sb.length - 1
    var len2 = num2Sb.length - 1

    var carry = 0
    while (len1 >= 0 || len2 >= 0) {
        var c1 = if (len1 < 0) 0 else Character.getNumericValue(num1Sb[len1])
        var c2 = if (len2 < 0) 0 else Character.getNumericValue(num2Sb[len2])

        var sum = c1 + c2 + carry

        var bit = sum % 10
        carry = sum / 10

        resultBilder.insert(0, bit)

        len1--
        len2--
    }

    if (carry > 0) {
        resultBilder.insert(0, carry)
    }
    println(resultBilder.toString())
}
