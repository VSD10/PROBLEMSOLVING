
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;

        // Move fastPointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fastPointer == null) return head; // n is greater than the length of the list
            fastPointer = fastPointer.next;
        }

        // Move both pointers until fastPointer reaches the end
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        // Remove the nth node from the end
        slowPointer.next = slowPointer.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveNthFromEnd s = new RemoveNthFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode result = s.removeNthFromEnd(head, n);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
