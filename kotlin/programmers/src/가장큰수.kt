import java.util.*

class Solution가장큰수 {
    fun solution(numbers: IntArray): String {

        val numberList = numbers.map { it.toString() }
        val sortList = numberList.sortedWith(kotlin.Comparator { o1, o2 ->
            if (o1.length == o2.length) o2.compareTo(o1)
            else (o2 + o1).compareTo(o1 + o2)
        })
        return if (sortList[0] == "0") "0"
        else sortList.joinToString("")
    }
}
//
//class Solution가장큰수 {
//    // 아 완전 탐색으로 풀고싶다....
//    var answer = "0"
//    fun solution(numbers: IntArray): String {
//
//        dfs(mutableListOf<Int>() , numbers.toMutableList())
//        return answer
//    }
//
//    fun dfs(tempList:MutableList<Int> , restList : MutableList<Int>){
//        if(restList.size == 0 ){
//            val tempString  = tempList.joinToString("")
//            //System.out.println(tempString)
//            if(tempString.length > answer.length) answer = tempString
//            else if(tempString.length == answer.length) {
//                //System.out.println(tempString)
//                tempString.forEachIndexed{ index , value ->
//                    if(answer[index].digitToInt() > tempString[index].digitToInt() ) return
//                    else if(answer[index].digitToInt() < tempString[index].digitToInt() ) {
//                        answer = tempString
//                        return
//                    }
//                }
//                //System.out.println(tempString)
//            }
//            return
//        }else{
//            restList.forEach {
//                val newTempList = tempList.toMutableList()
//                val newRestList = restList.toMutableList()
//                newTempList.add(it)
//                newRestList.remove(it)
//                dfs(newTempList, newRestList)
//            }
//        }
//    }
//}