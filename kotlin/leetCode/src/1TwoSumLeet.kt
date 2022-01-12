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
