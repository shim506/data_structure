fun main() {
}

class Solution단어변환 {
    val changingList = mutableListOf<MutableList<String>>()

    fun solution(begin: String, target: String, words: Array<String>): Int {
        var answer = 0
        var newWords = hashSetOf<String>()
        newWords.addAll(words)



        if (!newWords.contains(target)) return 0

        val tempList = mutableListOf<String>()
        tempList.add(begin)

        bfs(target, tempList, words.toMutableList())

        // 최초 원소 제외
        answer = changingList.minOf { it.size } - 1

        return answer
    }

    private fun bfs(target: String, tempList: MutableList<String>, words: MutableList<String>) {
        val newTempList = mutableListOf<String>()
        newTempList.addAll(tempList)

        if (tempList.last() == target) {
            changingList.add(newTempList)
            return
        } else {
            words.forEach {
                if (similar(it, tempList.last())) {
                    newTempList.add(it)
                    val newWords = mutableListOf<String>()
                    newWords.addAll(words)
                    newWords.remove(it)
                    bfs(target, newTempList, newWords)
                    newTempList.remove(it)
                }
            }
        }
    }

    private fun similar(str1: String, str2: String): Boolean {
        var count = 0
        for (i in str1.indices) {
            if (str1[i] == str2[i]) count++
        }
        return str1.length - count == 1
    }
}