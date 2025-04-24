package linkedList;
class Removenth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
          if (head == null || n <= 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;

        for (int i = 0; i <= n; i++) {
            if (fastPointer == null) return head; 
            fastPointer = fastPointer.next;
        }

       
        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;

        return dummy.next;
        
    }
    public static void main(String[] args)
	{
        Removenth s = new Removenth();
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