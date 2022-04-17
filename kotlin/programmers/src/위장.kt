class Solution위장 {
    fun solution(clothes: Array<Array<String>>): Int {
        //return clothes.groupBy { it[1] }.values.map { it.size + 1 }.reduce { valX, valY -> valX * valY }.minus(1) 
        val hashMap = hashMapOf<String, Int>()
        for (i in clothes.indices) {
            val key = clothes[i][1]
            hashMap[key] = hashMap.getOrDefault(key, 0) + 1
        }

        val iterator = hashMap.iterator()
        var answer = 1

        return if (hashMap.size == 1) {
            iterator.next().value
        } else {
            hashMap.forEach {
                answer *= (it.value + 1)
            }
            answer - 1
        }
    }
}

