
public class REORDER {

    // Your task: implement the logic inside this method
    public void reorderList(ListNode head) {
        if(head ==null || head.next==null) return ;
        ListNode slow=head,fast=head;

        //1. FIRST FINDING THE MIDDLE POINT
        while(fast != null && fast.next != null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        // 2. BREAKING INTO TWO LIST 
        ListNode prev=null;
        ListNode cur=slow.next;
        slow.next=null;

        // 3. REVERSING THE SECOND PART
        while(cur!=null)
        {
            ListNode next= cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        //4. MERGING THE BOTH PART
        
        ListNode first=head,second=prev;
        while(second!=null)
        {
            ListNode t1=first.next;
            ListNode t2=second.next;
            first.next=second;
            second.next=t1;
            first=t1;
            second=t2;
           
           
        }
        


        

    }

    // Utility method to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main method with sample data
    public static void main(String[] args) {
        // Sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        REORDER sol = new REORDER();
        sol.reorderList(head); // You implement this!

        System.out.print("Reordered List: ");
        printList(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}