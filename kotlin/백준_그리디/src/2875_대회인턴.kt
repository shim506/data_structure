import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (girl, boy, intern) = readLine().split(" ").map { it.toInt() }

    var maxTeamNum = min(girl / 2, boy)
    var rest = (girl - maxTeamNum * 2) + boy - maxTeamNum

    while (true) {
        if (rest >= intern || maxTeamNum == 0) {
            println(maxTeamNum)
            return
        } else {
            maxTeamNum--
            rest += 3
        }
    }
}