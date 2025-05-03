
package linkedList;
public class Rotate {
    public static void main(String[] args) {
        // Sample input: 1 -> 2 -> 3 -> 4 -> 5, rotate by k=2
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;
        Solution sol = new Solution();
        ListNode result = sol.rotateRight(head, k);

        // Print result
        System.out.println("Rotated List:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
          if (head == null || head.next == null || k == 0) return head;

        // Step 1: Get length of list
        int l = 1;
        ListNode len = head;
        while (len.next != null) {
            l++;
            len = len.next;
        }

        k = k % l;
        if (k == 0) return head;

        // Step 2: Find new tail at position l - k
        ListNode slow = head;
        for (int i = 1; i < l - k; i++) {
            slow = slow.next;
        }

        // Step 3: Rotate
        ListNode newHead = slow.next;
        slow.next = null;
        len.next = head; // connect old tail to head

        return newHead;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
