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
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode h_1 = A;
        ListNode h_2 = B;
        ListNode h_3 = new ListNode(-1);
        ListNode tail = h_3;

        while (h_1 != null  && h_2 !=null){
            if (h_1.val < h_2.val){
                tail.next = h_1;
                h_1 = h_1.next;
                tail = tail.next;
            }
            else{
                tail.next = h_2;
                h_2 = h_2.next;
                tail = tail.next;
            }
        }

        if (h_1 == null){
            tail.next = h_2;
        }
        else {
            tail.next = h_1;
        }

        h_3 = h_3.next;
        return h_3;
        
    }
}