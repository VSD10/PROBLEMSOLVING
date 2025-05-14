/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode list = new ListNode(0);
        ListNode dum = list;

        ListNode t = head;
        if (t.val == 0) {
            t = t.next;
        }
        int s = 0;
        while (t != null) {
            if (t.val != 0) {
                s += t.val;
            } else {
                dum.next = new ListNode(s);
                dum = dum.next;
                s = 0;
            }
            t = t.next;
        }
        return list.next;
    }
}

public class MergeNodes {
    public static void main(String[] args) {
        // Create the input linked list: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        // Call the mergeNodes function
        Solution solution = new Solution();
        ListNode result = solution.mergeNodes(head);

        // Print the resulting linked list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}