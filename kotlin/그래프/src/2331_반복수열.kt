import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.HashSet
import kotlin.math.pow

lateinit var hashSet: HashSet<Int>
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    hashSet = HashSet<Int>()


    val st = StringTokenizer(readLine(), " ")

    var A = st.nextToken()
    val P = st.nextToken().toInt()

    val mutableList = mutableListOf<Int>(A.toInt())
    while (true) {
        var value = 0
        A.forEach {
            value += (it - '0').toDouble().pow(P).toInt()
        }
        A = value.toString()
        if (mutableList.contains(value)) {
            println(mutableList.indexOf(value))
            break
        } else mutableList.add(value)
    }

   // println(mutableList.size)


}