class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ans = result;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum %= 10;
            ans.next = new ListNode(sum);
            ans = ans.next;
        }
        
        if (carry == 1) ans.next = new ListNode(1);
        return result.next;
    }

    // Sample test
    public static void main(String[] args) {
        ListNode l1 = buildList(new int[]{2, 4, 3});
        ListNode l2 = buildList(new int[]{5, 6, 4});

        AddTwoNumbers sol = new AddTwoNumbers();
        ListNode result = sol.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }

    // Helper to build list from array
    public static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : values) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
