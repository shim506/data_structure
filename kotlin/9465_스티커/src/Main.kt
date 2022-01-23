import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val T = readLine().toInt()

// 해당위치까지 올 수 있는 값들을 누적하여 해당 위의 값을 결정한다.
    repeat(T) {
        val N = readLine().toInt()
        val arr = Array<Array<Int>>(2) { Array<Int>(N + 1) { 0 } }
        val dp = Array<Array<Int>>(2) { Array<Int>(N + 1) { 0 } }

        val arr1 = readLine().split(" ").map { it.toInt() }
        val arr2 = readLine().split(" ").map { it.toInt() }

        arr[0] = arr1.toTypedArray()
        arr[1] = arr2.toTypedArray()

        var colNum = -1
        var rowNum = 0
        while (colNum != N) {
            dp[]

        }


        println(max(arr[0][N], arr[1][N]))
    }


}