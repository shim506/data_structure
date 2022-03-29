class Solution {
    val hashMap = hashMapOf<String, Int>()
    fun solution(participant: Array<String>, completion: Array<String>): String {
        participant.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        completion.forEach { key ->
            hashMap[key]?.let { value ->
                if (value == 1) hashMap.remove(key) else hashMap[key] = value - 1
            }
        }
        return hashMap.iterator().next().key

    }
}