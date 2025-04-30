  class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class sort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=null,slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return merge(l1,l2);      
    }

    ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode l=new ListNode(0),a=l;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                a.next=l1;
                l1=l1.next;
                a=a.next;

            }
            else{
                a.next=l2;
                l2=l2.next;
                a=a.next;  
            }
        }
        if(l1!=null)
        {
            a.next=l1;

        }
         if(l2!=null)
        {
            a.next=l2;

        }
        return l.next;

    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        sort s = new sort();
        ListNode sortedList = s.sortList(head);

        // Print the sorted list
        while (sortedList != null) {
            System.out.print(sortedList.val + " ");
            sortedList = sortedList.next;
        }
    }
}