import java.io.*
import java.util.*
import kotlin.math.round

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()

    val arr = arrayOfNulls<String>(num)

    for (i in 1..num) {
        val scoreList = readLine().split(' ')
        var sum = 0
        scoreList.forEach {
            sum += it.toInt()
        }
        sum -= scoreList[0].toInt()
        val avg = (sum / scoreList[0].toDouble())


        var pass: Int = 0
        for (j in 1..scoreList.size-1){
            if (scoreList[j].toInt() > avg){
                pass ++
            }
        }/*
        scoreList.forEach {
            if (it.toInt() > avg) {
                pass++
            }
        }*/
        val resultVal = pass / scoreList[0].toDouble() * 100
        val result = String.format("%.3f", resultVal) + "%"
        arr[i - 1] = result
    }

    arr.forEach {
        println(it)
    }


}

