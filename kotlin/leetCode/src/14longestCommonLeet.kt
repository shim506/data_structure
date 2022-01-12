import java.lang.StringBuilder


fun longestCommonPrefix(strs: Array<String>): String {
    var result = StringBuilder()


    var shortestWord = strs[0]
    strs.forEach { if (it.length < shortestWord.length) shortestWord = it }


    for (i in shortestWord.indices) {
        strs.forEach {
            if (it[i] != shortestWord[i]) {
                return result.toString()
            }
        }
        result.append(shortestWord[i])
    }
    return result.toString()


}