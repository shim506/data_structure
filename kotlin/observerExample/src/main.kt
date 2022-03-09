fun main() {

    val speaker = StatusChecker(object : StatusObserver {
        override fun onAbnormalStatus(status: Status) {
            TODO("Not yet implemented")
        }
    })


}

abstract class StatusSubject() {
    val observers = mutableListOf<StatusObserver>()

    fun click(status: Status) {
        observers.forEach {
            it.onAbnormalStatus(status)
        }
    }


}

class StatusChecker(val statusObserver: StatusObserver) {

    fun click(status: Status) {
        statusObserver.onAbnormalStatus(status)
        if (status != Status.TREE) {
            checker()
        }
    }

    fun checker() {

    }
}
class StateEmailSender

interface StatusObserver {
    fun onAbnormalStatus(status: Status)
}

enum class Status {
    ONE, TWO, TREE
}

