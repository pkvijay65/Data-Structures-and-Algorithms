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
       // public int checkPalindrome(ArrayList<Integer> A){
    //     int n = A.size();

    //     int s = 0;
    //     int e = n-1;
    //     while (s<=e){
    //         if (A.get(s) != A.get(e)){
    //             return false;
    //         }
    //         s++;
    //         e--;
    //     }
    //     return true;
    // }
    public ListNode findMiddle(ListNode B){
        ListNode slow = B;
        ListNode fast = B;

        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse (ListNode C){
        ListNode prev = null;
        ListNode current = C;
        // ListNode nxt = C.next;

        while (current != null){
             ListNode nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode A) {
          //step -1 -> find middle of LL
        ListNode middle = findMiddle(A);
        //step 2 -> reverse the LL after mid;
        ListNode nxt = middle.next;
        ListNode reverseHead = reverse(nxt);

        //step -3 compare the first half and second half
        ListNode temp1 = A;
        ListNode temp2 = reverseHead;
        while (temp2!=null){
            if (temp1.val != temp2.val){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

// converting LL into array and then checking 
//         ArrayList<Integer> ans = new ArrayList<Integer>();

//         ListNode current = A;

//         while (current!=null){
//             ans.add(current.val);
//             current = current.next;
//         }

//         return checkPalindrome(ans);
    }
}