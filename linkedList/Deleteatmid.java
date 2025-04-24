package linkedList;

// Leetcode 2095. Delete the Middle Node of a Linked List
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class DeleteAtMid {
    public ListNode deleteMiddle(ListNode head) {
        // If the list is empty or has only one node, return null
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head.next.next;

        // Use the fast and slow pointer technique to find the middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {
        DeleteAtMid s = new DeleteAtMid();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = s.deleteMiddle(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }
}
