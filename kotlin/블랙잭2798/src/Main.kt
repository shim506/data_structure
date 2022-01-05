import java.io.InputStreamReader
import java.util.*

fun main() = with(InputStreamReader(System.`in`)) {

    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    var numArray = Array(N) { 0 }

    st = StringTokenizer(readLine(), " ")
    repeat(N){
        numArray[it] = st.nextToken().toInt()
    }

    var total = 0
    for (i in 0 until N - 2) {
        if (numArray[i] > M) continue
        for (j in i+1 until N - 1) {
            if (numArray[i] + numArray[j] > M) continue
            for (k in j+1 until N) {
                if (numArray[i] + numArray[j] + numArray[k] > M) continue
                if (total < numArray[i] + numArray[j] + numArray[k]) {
                    total = numArray[i] + numArray[j] + numArray[k]
                    if (M == total){
                             break
                    }
                }
            }
        }
    }
    println(total)
}