import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

// 1052
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine(), " ")
    var N = st.nextToken().toInt()
    var K = st.nextToken().toInt()

    var needBottle = 0


    while (true) {
        val binArr = Integer.toBinaryString(N)
        val cnt = binArr.count { ele: Char -> ele == '1' }
        //println(cnt)
        if (cnt <= K) {
            break
        }
        N++
        needBottle++
    }


    println(needBottle)
}