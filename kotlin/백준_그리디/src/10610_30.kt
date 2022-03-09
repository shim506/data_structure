import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val N = readLine().toMutableList()

    if(N.map { it.toInt() }.sum() %3 !=0 || !N.contains('0')){
        println(-1)
    } else{
        N.sortDescending()
        val sb = StringBuilder()
        for (i in 0 until N.size){
            sb.append(N[i])
        }
        println(sb)
    }
}