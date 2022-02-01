import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val arr = readLine().split(" ").map { it.toInt() }

    val dp = IntArray(N) { 0 }
    val lis = IntArray(N) { 1 }
    val reversedLis = IntArray(N) { 1 }

    for (i in 1 until N) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                lis[i] = max(lis[i], lis[j] + 1)
            }
        }
    }

    for (i in N - 2 downTo 0) {
        for (j in N - 1 downTo i+1) {
            if (arr[i] > arr[j]) {
                reversedLis[i] = max(reversedLis[i], reversedLis[j] + 1)
            }
        }
    }

    var max = 0
    for (i in 0 until N) {
        if (max < reversedLis[i] + lis[i])
        max = reversedLis[i] + lis[i]
    }


    println(max -1 )

}