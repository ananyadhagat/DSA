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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
     ListNode current1=list1;
     ListNode current2=list2;
  
    ListNode prev=list1;
     for(int i=0; i<a-1; i++){
        current1= current1.next;

     } 
      for(int i=0; i<b; i++){
       prev= prev.next;
     }

       ListNode prev2=prev.next;
     prev.next=null;

     current1.next=current2;
     while(current2!=null && current2.next!=null){
        current2= current2.next;
     }
     current2.next=prev2;
     return list1;
    }
}