import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val (N, price) = readLine().split(" ").map { it.toInt() }
    val coinList = mutableListOf<Int>()

    repeat(N) {
        coinList.add( readLine().toInt())
    }
    var total = 0
    var coinNum = 0
    var coinIdx = N - 1
    while (total != price) {
        if (total + coinList[coinIdx] <= price) {
            total += coinList[coinIdx]
            coinNum++
        } else {
            coinIdx--
        }
    }
    println(coinNum)
}