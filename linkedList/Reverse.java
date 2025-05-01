class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Reverse{
    Node head;

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void printList(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }System.out.println();
    }
public static void main(String[] args) {
    Reverse list = new Reverse();
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(5);

    System.out.println("Original Linked List:");
    printList(list.head);

    list.reverse();

    System.out.println("Reversed Linked List:");
    printList(list.head);
}

}