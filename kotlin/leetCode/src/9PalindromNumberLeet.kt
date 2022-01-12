

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    } else {
        val str = x.toString()
        val midIdx = str.length / 2 - 1
        for (i in 0..midIdx) {
            if (str[i] != str[str.length - 1 - i]) {
                return false
            }
        }
        return true
    }

}