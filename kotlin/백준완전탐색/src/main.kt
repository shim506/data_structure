import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (E, S, M) = readLine().split(" ").map { it.toInt() }
    var nowE = 0
    var nowS = 0
    var nowM = 0

    println(solution(Triple(E, S, M), Triple(nowE, nowS, nowM), 0))


}

fun solution(ESM: Triple<Int, Int, Int>, nowESM: Triple<Int, Int, Int>, count: Int): Int {
    if (ESM.first == nowESM.first && ESM.second == nowESM.second && ESM.third == nowESM.third) {
        return count
    } else {
        val newESM = Triple(nowESM.first + 1, nowESM.second + 1, nowESM.third + 1)
        return solution(ESM, newESM, count + 1)
    }
}