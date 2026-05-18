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
//length of linked list
int count=0;
ListNode temp= head;
while(temp!=null){
    count++;
    temp=temp.next;

}
int length= count;
   
    ListNode curr=head;
   if(length==n){
    return head.next;
   }
for(int i=1; i<length-n; i++){
    curr=curr.next;
}
    curr.next=curr.next.next;

    return head;    
    }    
}