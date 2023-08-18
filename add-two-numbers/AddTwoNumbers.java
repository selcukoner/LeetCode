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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head,node;
        head=new ListNode();
        node=head;
  
         if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
           }
        
        int carrier = 0;
        while(l1 != null || l2 !=null ){
            int sumOfDigits = 0;

            if(l1 == null){
                sumOfDigits = l2.val;
                l2 = l2.next; 
            }else if(l2 == null){
                sumOfDigits = l1.val;
                l1 = l1.next;
            }else{
                sumOfDigits = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }

            sumOfDigits = (sumOfDigits + carrier) ;
            carrier = (sumOfDigits)/10;

            node.next = new ListNode(sumOfDigits % 10);
            node = node.next;

        }

        if(carrier != 0){
            node.next = new ListNode(carrier);
        }

        return head.next;
    }
}