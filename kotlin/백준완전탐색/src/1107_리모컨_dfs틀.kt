//import java.io.BufferedReader
//import java.io.InputStreamReader
//import java.util.StringTokenizer
//import kotlin.math.abs
//import kotlin.math.min
//
//var targetChannel: Int = 0
//var possibleChannelList = mutableListOf<Int>()
//val errorList = mutableListOf<Int>()
//val NOW_CHANNEL = 100
//fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
//
//    // 앞에서부터 검사 -> 못쓰는 숫자일시 +,- 를 각각 리스트에추가
//    // 원래 값과 비교
//
//
//    targetChannel = readLine().toInt()
//    val errorCount = readLine().toInt()
//    val st = StringTokenizer(readLine(), " ")
//    repeat(errorCount) {
//        errorList.add(st.nextToken().toInt())
//    }
//    if (targetChannel == 100) {
//        println(0)
//        return
//    }
//
//    channelDfs(targetChannel.toString(), 0)
//    var differValue = Int.MAX_VALUE
//
//    possibleChannelList.forEach {
//        differValue = min(differValue, abs(it - targetChannel))
//    }
//    println(differValue)
//}
//
//fun channelDfs(possibleChannel: String, cnt: Int) {
//    if (possibleChannel.length == cnt) {
//        possibleChannelList.add(possibleChannel.toInt())
//    } else {
//        if (errorList.contains(possibleChannel[cnt].digitToInt())) {
//            val newValue = findSmallListNum(possibleChannel[cnt])
//            val sb = StringBuffer(possibleChannel)
//            channelDfs(sb.replace(cnt, cnt + 1, newValue).toString(), cnt + 1)
//        } else {
//            channelDfs(possibleChannel, cnt + 1)
//        }
//    }
//}
//
//fun findSmallListNum(numChar: Char): String {
//    val num = numChar.digitToInt()
//
//    var upValue = num
//    var downValue = num
//    while (true) {
//        if (errorList.contains(upValue)) upValue++ else break
//        if (upValue > 9) {
//            upValue = Int.MAX_VALUE - 20
//            break
//        }
//    }
//    while (true) {
//        if (errorList.contains(downValue)) downValue-- else break
//        if (downValue < 0) {
//            downValue = Int.MIN_VALUE + 20
//            break
//        }
//    }
//
//    return if (abs(upValue - num) > abs(num - downValue)) {
//        downValue.toString()
//    } else {
//        upValue.toString()
//    }
//}
