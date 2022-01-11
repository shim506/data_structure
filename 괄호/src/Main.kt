import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    repeat(N) {
        //val st = StringTokenizer(readLine(), "")
        val inputStr = readLine()
        val stack = Stack<Char>()

        inputStr.forEach {

            if (it == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    stack.push(it)
                }
            } else {
                stack.push(it)
            }
        }

        if (stack.isEmpty()) println("YES") else println("NO")
    }

}