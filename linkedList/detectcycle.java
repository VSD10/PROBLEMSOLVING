
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
     }
  }
 
public class detectcycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(fast==null ||fast.next==null) return null;
        while(head!=slow)
        {
            head=head.next;
            slow=slow.next;
        }
        return head;
        
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head; // Creating a cycle

        detectcycle dc = new detectcycle();
        ListNode cycleStart = dc.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }

}