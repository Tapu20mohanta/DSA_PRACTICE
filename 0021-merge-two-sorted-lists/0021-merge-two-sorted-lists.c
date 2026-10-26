/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* l1=list1;
    struct ListNode* l2=list2;
    struct ListNode * ans=NULL;
    if(l1==NULL){
        return l2;
    }
    else if(l2==NULL){
        return l1;
    }
    if(l1->val<=l2->val){
        ans=l1;
        l1=l1->next;
        

    } 
    else{
        ans=l2;
        l2=l2->next;

    }
    struct ListNode* res=ans;
    while(l1!=NULL && l2!=NULL){
        if(l1->val<=l2->val){
            ans->next=l1;
            l1=l1->next;
        }
        else{
            ans->next=l2;
            l2=l2->next;
        }
        ans=ans->next;
        
    }
    if(l1==NULL){
        ans->next=l2;
    }
    else{
        ans->next=l1;
    }
    // ans->next=NULL;
    // l1=NULL;
    // l2=NULL;

    return res;

    
}