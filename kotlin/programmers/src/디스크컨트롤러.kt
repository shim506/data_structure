import java.util.*

// waitQueue , readyQueue 로 나누어 관리한다.

class Solution디스크컨트롤러 {
    fun solution(jobs: Array<IntArray>): Int {
        var totalTime = 0
        var time = 0

        val waitQueue = PriorityQueue<Job>(compareBy{it.requestTime})
        val readyQueue = PriorityQueue<Job>(compareBy{it.durationTime})
        waitQueue.addAll( jobs.map{Job(it[0] , it[1])}   )

        while(!waitQueue.isEmpty() || !readyQueue.isEmpty()){
            while(!waitQueue.isEmpty() && waitQueue.peek().requestTime <= time ){
                readyQueue.add(waitQueue.poll())
            }
            if(!readyQueue.isEmpty()){
                val job = readyQueue.poll()
                time += job.durationTime
                totalTime += time - job.requestTime
            }else{time ++}
        }

        return totalTime/jobs.size
    }
}

data class Job(val requestTime : Int , val durationTime:Int)