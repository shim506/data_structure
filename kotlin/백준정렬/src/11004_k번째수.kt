import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.math.BigInteger
import java.util.*
import kotlin.math.max


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()


    val mutableList = mutableListOf<Long>()
    st = StringTokenizer(readLine(), " ")
    repeat(N){
        mutableList.add(st.nextToken().toLong())
    }


    mutableList.sort()
    println(mutableList[K-1])


}