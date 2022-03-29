import java.io.BufferedReader
import java.io.InputStreamReader

const val MAX_E = 15
const val MAX_S = 28
const val MAX_M = 19

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (E, S, M) = readLine().split(" ").map { it.toInt() }
    var nowE = 0
    var nowS = 0
    var nowM = 0
    var count = 0
    while (true) {
        if (nowE == E && nowS == S && nowM == M) {
            println(count)
            break
        }
        nowE++
        nowS++
        nowM++

        if (nowE > MAX_E) nowE = 1
        if (nowS > MAX_S) nowS = 1
        if (nowM > MAX_M) nowM = 1
        count++
    }
}
