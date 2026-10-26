/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode * pre=NULL;
    struct ListNode * temp=head;
    struct ListNode * next=head;
    while(next!=NULL){
        temp=next;
        next=next->next;
        temp->next=pre;
        pre=temp;
        
    }
    return temp;

}