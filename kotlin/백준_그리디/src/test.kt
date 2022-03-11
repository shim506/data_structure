import java.io.*

fun main() {
    val url = "C:/Users/User/Desktop/CodeSquad/AndroidMission/kotlin-drawingapp/textSource.txt"
    val bufferedReader: BufferedReader = File(url).bufferedReader()
    val inputString = bufferedReader.use { it.readText() }
    println(inputString)

}

