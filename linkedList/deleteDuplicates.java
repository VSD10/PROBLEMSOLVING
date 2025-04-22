package linkedList;

// Leetcode 83. Remove Duplicates from Sorted List
// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

 class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class deleteDuplicates {
    public ListNode deleteDuplicates1(ListNode head) {

        ListNode cur=head;
        if(cur==null) return head;
        while(cur.next!=null && cur!=null)
        {
            if(cur.val == cur.next.val)
            {
                cur.next=cur.next.next;
            }
            else{

            cur=cur.next;
            }
        }
        return head;
        
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        deleteDuplicates obj = new deleteDuplicates();
        ListNode result = obj.deleteDuplicates1(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
} 
