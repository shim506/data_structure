fun hasCycle1(head: ListNode?): Boolean {

    val hashset = HashSet<ListNode>()
    var cur = head
    while (cur?.next != null) {
        if (hashset.contains(cur)) {
            return true
        } else {
            hashset.add(cur)
        }
        cur = cur.next

    }
    return false

}

fun hasCycle2(head: ListNode?): Boolean {
    var idx = 0
    val hashset = HashSet<ListNode>()
    var cur = head
    while (cur?.next != null) {
        hashset.add(cur)
        cur = cur.next
        idx++
        if (idx > hashset.size) {
            return true
        }
    }
    return false

}
