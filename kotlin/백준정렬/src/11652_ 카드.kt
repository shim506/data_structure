import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.math.BigInteger
import kotlin.math.max


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toInt()

    val hashMap = hashMapOf<Long, Int>()

    var maxCount = 0

    repeat(N) {
        val numStr = readLine().toLong()
        hashMap[numStr] = hashMap.getOrDefault(numStr, 0) + 1
        maxCount = maxOf(hashMap[numStr]!!, maxCount)
    }



    var numList = hashMap.filter { it.value >= maxCount }.map { it.key }.toMutableList()


    // 만약 hashMap 에 Long 이 아닌 String 을 넣는다면
    // String 기준으로 sort 되어 틀린 것이다.
    numList.sort()
    println(numList[0])


}