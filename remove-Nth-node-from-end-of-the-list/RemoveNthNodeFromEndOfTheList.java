/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pointer1= head, pointer2 = head;
        
        for(int i = 0; i< n-1; i++){ // pointer2 is end of the window having size n-1
            pointer2 = pointer2.next;
        }

        if(pointer2.next == null){ // delete from the beginning
            head = pointer1.next;
            return head;
        }

        while(pointer2.next.next != null){
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }

        pointer1.next = pointer1.next.next; // delete from middle and from end

        return head;
    }  
}