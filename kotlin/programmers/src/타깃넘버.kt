fun main() {
    val solution = Solution타겟넘버()
    println(solution.solution(intArrayOf(4, 1, 2, 1), 2))
}

class Solution타겟넘버 {
    val operationList = mutableListOf<MutableList<Boolean>>()

    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        val tempOperationList = mutableListOf<Boolean>()
        dfs(tempOperationList, numbers.size)

        if (operationList.size == 0) {
            return 0
        } else {
            for (i in operationList.indices) {
                var total = 0
                for (j in operationList[0].indices) {
                    if (operationList[i][j]) total += numbers[j]
                    else total -= numbers[j]
                }
                if (total == target) answer++
            }
            return answer
        }

    }

    private fun dfs(tempList: MutableList<Boolean>, size: Int) {
        val tempListCopy = mutableListOf<Boolean>()
        tempListCopy.addAll(tempList)

        if (tempListCopy.size >= size) {
            operationList.add(tempListCopy)
            return
        } else {
            tempListCopy.add(true)
            dfs(tempListCopy, size)
            tempListCopy.removeAt(tempListCopy.size - 1)

            tempListCopy.add(false)
            dfs(tempListCopy, size)
        }
    }
}