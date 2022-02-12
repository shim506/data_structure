import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val input = readLine()

    val stack = Stack<Char>()

    var chopCnt = 0
    input.forEachIndexed { index, it ->
        if (it == '(') {
            stack.push(it)
        } else {
            stack.pop()
            if (input[index - 1] == '(') chopCnt += stack.size
            else chopCnt++
        }
        //println(chopCnt)
    }

    println(chopCnt)
}