
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun deleteDuplicates1(head: ListNode?): ListNode? {
    var cur = head

    while(cur?.next != null){
        if(cur.`val` == cur?.next?.`val`){
            cur.next = cur?.next?.next
        }else{
            cur = cur.next
        }
    }

    return head

}

fun deleteDuplicates2(head: ListNode?): ListNode? {
    var cur = head

    while (cur?.next != null) {
        if (cur.`val` == cur?.next?.`val`) {

            var nextNode = cur.next
            while (nextNode?.`val` == cur.`val`) {
                nextNode = nextNode.next
            }
            if (nextNode == null) {
                cur.next = null
            } else {
                cur.next = nextNode
            }
        } else {
            cur = cur.next
        }
    }

    return head

}

