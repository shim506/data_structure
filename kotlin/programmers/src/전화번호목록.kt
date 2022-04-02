class Solution {
    val hashMap = hashMapOf<Char, MutableList<String>>()
    fun solution(phone_book: Array<String>): Boolean {
        val answer = true
        phone_book.forEach { phoneBookStr ->
            hashMap[phoneBookStr[0]]?.forEach { hashmapStr ->
                if (phoneBookStr < hashmapStr && phoneBookStr.startsWith(hashmapStr)) return false
                else if (phoneBookStr > hashmapStr && hashmapStr.startsWith(phoneBookStr)) return false
                else hashMap[phoneBookStr[0]]?.add(hashmapStr)
            } ?: run { hashMap[phoneBookStr[0]] = mutableListOf<String>(phoneBookStr) }
        }
        return answer
    }
}

