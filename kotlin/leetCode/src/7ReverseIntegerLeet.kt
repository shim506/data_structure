import java.lang.NumberFormatException
import kotlin.math.abs


    fun reverse(x: Int): Int {
        val isMinus = x < 0
        var str = abs(x).toString().reversed()
        return try {
            str.toInt() * (if (isMinus) -1 else 1)
        } catch (e: NumberFormatException) {
            0
        }
    }
