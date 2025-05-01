// ListNode class (Node of the linked list)
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Solution class containing the reverseBetween method

// ReverseBetweenDemo class containing the main method
public class ReverseBetweenDemo {
    // Method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display the original list
        System.out.println("Original List:");
        printList(head);

        // Reverse from position 2 to 4
        Solution sol = new Solution();
        ListNode result = sol.reverseBetween(head, 2, 4);

        // Display the modified list
        System.out.println("List After Reversing Between 2 and 4:");
        printList(result);
    }
}
     class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            if (head == null) return head;
    
            // Dummy node to handle edge cases
            ListNode dum = new ListNode(0);
            dum.next = head;
    
            // Move `lprev` and `cur` to the correct position
            ListNode lprev = dum;
            ListNode cur = head;
            for (int i = 0; i < left - 1; i++) {
                lprev = lprev.next;
                cur = cur.next;
            }
    
            // Reverse the sublist from left to right
            ListNode sub = cur, prev = null;
            for (int i = 0; i <= right - left; i++) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
    
            // Reconnect the reversed sublist to the rest of the list
            lprev.next = prev;
            sub.next = cur;
    
            return dum.next;
        }
    }
