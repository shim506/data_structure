import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()

    val numStack = Stack<Int>()
    val result = mutableListOf<Char>()
    var nowNum = 1
    numStack.add(0)
    repeat(N) {
        val num = readLine().toInt()

        while (nowNum <= num) {
            numStack.push(nowNum)
            result.add('+')
            nowNum++
        }

        if (numStack.peek() > num) {
            println("NO")
            exitProcess(0)
        }

        numStack.pop()
        result.add('-')
    }

    result.forEach { println(it) }
}
