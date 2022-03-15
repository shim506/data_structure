import java.lang.reflect.Executable

fun main() {


    try{
        println("s")
        throw Exception()
        println("k")
    }catch (e:Exception){
        println("dd")
    }
}
fun printBooleanArray(array: Array<Array<Boolean>>) {
    for (i in 1..array.size) {
        for (j in 1..array[0].size) {
            print("${array[i][j]} ")
        }
        println()
    }
    println()
    println()
}
fun printIntArray(array: Array<Array<Int>>) {
    for (element in array) {
        for (j in 0 until array[0].size) {
            print("${element[j]} ")
        }
        println()
    }
    println()
    println()
}

