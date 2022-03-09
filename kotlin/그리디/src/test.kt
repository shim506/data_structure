import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

lateinit var matrixEdge: Array<MutableList<Int>>
val sb: StringBuilder = StringBuilder()
lateinit var checkArray: Array<Int>


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine(), " ")

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()
    val V = st.nextToken().toInt()

    matrixEdge = Array(N + 1) { mutableListOf() }

    // 지나친 노드 확인
    checkArray = Array<Int>(N + 1) { 0 }

    // 경로 matrix 세팅
    repeat(M) {
        val nodes = readLine().split(" ").map { it.toInt() }
        matrixEdge[nodes[0]].add(nodes[1])
        matrixEdge[nodes[1]].add(nodes[0])
    }

    dfs(V)
    println(sb)

    checkArray = Array<Int>(N + 1) { 0 }
    sb.clear()

    bfs(V)
    println(sb)
}


fun dfs(node: Int) {
    checkArray[node] = 1
    sb.append("$node ")
    val temp = matrixEdge[node].sorted()
    temp.forEach { if (checkArray[it] == 0) dfs(it) }
}

fun bfs(node: Int) {
    val queue = LinkedList<Int>()
    checkArray[node] = 1
    queue.add(node)
    sb.append("$node ")


    while (queue.isNotEmpty()) {
        val newNode = queue.poll()

        matrixEdge[newNode].sorted().forEach {
            if (checkArray[it] == 0) {
                checkArray[it] = 1
                queue.add(it)
                sb.append("$it ")
            }
        }
    }
}

