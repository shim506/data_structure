import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()
    val mutableList = mutableListOf<Int>()
    val st = StringTokenizer(readLine(), " ")
    repeat(N) {
        mutableList.add(st.nextToken().toInt())
    }
    mutableList.sort()


    if (N > 1) {
        for (i in 1 until mutableList.size) {
            mutableList[i] = mutableList[i] + mutableList[i - 1]
        }
    }
    println(mutableList.sum())
}