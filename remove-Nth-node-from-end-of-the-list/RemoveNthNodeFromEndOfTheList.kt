/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var head = head
        var pointer1 = head; var pointer2= head;
        
        for(i in 0 until n-1){
            pointer2 = pointer2?.next
        }

        if(pointer2?.next == null){
            head = pointer1?.next
            return head
        }

        while(pointer2?.next?.next != null){
            pointer2 = pointer2?.next
            pointer1 = pointer1?.next
        }

        pointer1?.next = pointer1?.next?.next

        return head

    }
}