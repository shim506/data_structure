import java.util.*
class Solution프린터 {
    fun solution(priorities: IntArray, location: Int): Int {

        // 순서, 운선순위 -> pair로

        val linkedList = ArrayDeque<Pair<Int,Int>>()
        priorities.forEachIndexed(){ index , value ->
            linkedList.add(Pair(index , value ))
        }

        var count = 0
        while(!linkedList.isEmpty()){
            val temp = linkedList.poll()
            if(linkedList.any{it.second > temp.second}){
                linkedList.add(temp)
            }else{
                count++
                if(temp.first == location) break
            }
        }

        return count
    }
}