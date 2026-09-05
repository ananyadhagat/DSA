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
    public ListNode[] splitListToParts(ListNode head, int k) {
     ListNode[] ans= new ListNode[k];

     int size=0;
     ListNode current= head;
     while(current !=null){
        size++;
        current= current.next;
     }  
     int partSize = size / k;
    int extra = size % k;

    current = head;

    // 3. Create each part
    for (int i = 0; i < k; i++) {

        ans[i] = current;

        int currentSize = partSize;

        if (extra > 0) {
            currentSize++;
            extra--;
        }

        // Move to last node of current part
        for (int j = 1; j < currentSize; j++) {
            current = current.next;
        }

        // Break the list
        if (current != null) {
            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
        }
    }

    return ans;

    }
}