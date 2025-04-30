
/**
 * This class provides a solution to detect a cycle in a singly-linked list.
 * 
 * The `hasCycle` method uses Floyd's Cycle-Finding Algorithm, also known as the 
 * Tortoise and Hare algorithm. It employs two pointers, `slow` and `fast`. 
 * The `slow` pointer moves one step at a time, while the `fast` pointer moves 
 * two steps at a time. If there is a cycle in the list, the `fast` pointer will 
 * eventually meet the `slow` pointer. If the `fast` pointer reaches the end of 
 * the list (i.e., `null`), then there is no cycle.
 * 
 * Time Complexity: O(n), where n is the number of nodes in the linked list.
 * Space Complexity: O(1), as no additional space is used.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class hasCycle {
    public boolean hasCycle1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Sample data to test the hasCycle1 method
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creates a cycle

        hasCycle solution = new hasCycle();
        boolean result = solution.hasCycle1(head);
        System.out.println("Cycle detected: " + result); // Expected output: true
    }
}
 
