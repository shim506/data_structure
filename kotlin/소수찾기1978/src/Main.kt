import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

//    var cnt = 0
//    val N = readLine().toInt()
//    val numList = readLine().split(' ')
//    repeat(N) {
//        if (isDecimalNum(numList[it ].toInt())) {
//            cnt++;
//        }
//    }
//    println(cnt)

    println(recur(readLine().toInt()))


}
fun recur(num: Int, value: Int = 1) : Int{
    if (num == 0) {
        return value
    } else {
        return recur(num - 1, value * num)
    }
}

fun isDecimalNum(num: Int): Boolean {
    if (num == 1) {
        return false
    }
    for (i in 2 until num) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
