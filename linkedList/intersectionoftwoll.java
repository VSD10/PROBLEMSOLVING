/**
 * This class provides a solution to find the intersection node of two singly-linked lists.
 * 
 * The `getIntersectionNode` method uses two pointers to traverse the lists. When a pointer
 * reaches the end of a list, it is redirected to the head of the other list. This ensures
 * both pointers traverse the same number of nodes when they meet at the intersection point
 * or both reach the end (`null`) if there is no intersection.
 * 
 * Time Complexity: O(n + m), where n and m are the lengths of the two lists.
 * Space Complexity: O(1), as no additional space is used.
 */

// Leetcode 160. Intersection of Two Linked Lists  
    package linkedList;

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int x, ListNode nextNode) {
            val = x;
            next = nextNode;
        }
    }
    
    public class intersectionoftwoll {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            ListNode a = headA;
            ListNode b = headB;
            while (a != b) {
                a = (a != null) ? a.next : headB;
                b = (b != null) ? b.next : headA;
            }
            return a;
        }
    
        public static void main(String[] args) {
            // Sample data to test the getIntersectionNode method
            ListNode headA = new ListNode(4);
            ListNode headB = new ListNode(5);
            ListNode common = new ListNode(8, new ListNode(10));
            headA.next = new ListNode(1, common);
            headB.next = new ListNode(6, new ListNode(1, common));
    
            intersectionoftwoll solution = new intersectionoftwoll();
            ListNode intersection = solution.getIntersectionNode(headA, headB);
            System.out.println("Intersection at node with value: " + (intersection != null ? intersection.val : "null"));
        }
    }
    