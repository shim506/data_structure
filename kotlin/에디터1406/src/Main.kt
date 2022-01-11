import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val str = readLine()
    var left = Stack<Char>()
    var right = Stack<Char>()

    str.forEach {
        left.push(it)
    }

    val N = readLine().toInt()
    repeat(N) {
        val st = StringTokenizer(readLine(), " ")
        try {
            when (st.nextToken()) {
                "L" -> right.push(left.pop())
                "D" -> left.push(right.pop())
                "B" -> left.pop()
                "P" -> left.push(st.nextToken()[0])
            }
        } catch (e: EmptyStackException) {

        }
    }


    println(left.toCharArray() + right.toCharArray().reversed())


}