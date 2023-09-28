/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode* pointer1;
    struct ListNode* pointer2;
    pointer1 = head;
    pointer2 = head;

    for(int i = 0; i < n-1; i++){ // traverse 
        pointer2 = pointer2 -> next;
    }

    if(pointer2 -> next == NULL){ // delete from beginning
        head = pointer1 -> next;
        return head;
    }

    while(pointer2 -> next -> next != NULL){ // delete from middle or from the end
        pointer2 = pointer2 -> next;
        pointer1 = pointer1 -> next;
    }

    pointer1 -> next = pointer1 -> next -> next; 

    return head;
}