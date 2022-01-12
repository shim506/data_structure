fun main() {
    val input = intArrayOf(2, 7, 11, 15)
    val target = 9

    twoSum(input, target)

}

fun twoSum(nums: IntArray, target: Int): IntArray {


    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (target == nums[i] + nums[j]) {
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf(-1, -1)
}
