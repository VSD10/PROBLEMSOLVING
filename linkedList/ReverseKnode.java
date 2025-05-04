class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseKnode {

    void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" → ");
            head = head.next;
        }
        System.out.println();
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public ListNode getnth(ListNode cur, int k) {
        while (k > 1 && cur != null) {
            cur = cur.next;
            k--;
        }
        return cur;
    }

    public ListNode reverseBetween(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) return head;

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode kth = getnth(temp, k);
            if (kth == null) {
                if (prev != null) prev.next = temp;  // link the remaining nodes
                break;
            }

            ListNode next = kth.next;
            kth.next = null;

            // Fix: reverse the current group and connect properly
            ListNode reversedHead = reverse(temp);
            System.out.println(reversedHead.val); // Debugging line to check the reversed
            System.out.println(temp.val);
            if (prev == null) {
                head = reversedHead; // update head only once at the beginning
            } else {
                prev.next = reversedHead;
            }

            prev = temp; // temp is now the tail of the reversed group
            temp = next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        ReverseKnode sol = new ReverseKnode();
        sol.printList(head);

        int k = 2;
        head = sol.reverseBetween(head, k);  // Fix: update head with return value

        System.out.println("List After Reversing in Groups of " + k + ":");
        sol.printList(head);
    }
}
