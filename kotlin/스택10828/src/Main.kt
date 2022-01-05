import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    var stack = Stack<Int>()

    repeat(readLine().toInt()) {
        val order = readLine().split(' ')
        when (order[0]) {
            "push" -> stack.push(order[1].toInt())
            "pop" -> println("${if (stack.empty()) -1 else stack.pop()}")
            "size" -> println(stack.size)
            "empty" -> println("${if (stack.empty()) 1 else 0}")
            "top" -> println("${if (stack.empty()) -1 else stack.peek()}")
        }
    }


}
