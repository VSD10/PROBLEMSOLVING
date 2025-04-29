class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    // Insert at the beginning
    public void insertAtFirst(int val) {
        Node value = new Node(val);
        if (head == null) {
            head = value;
            tail = value;
        } else {
            value.next = head;
            head.prev = value;
            head = value;
        }
        length++;
    }

    // Insert at the end
    public void insertAtEnd(int val) {
        Node value = new Node(val);
        if (head == null) {
            head = value;
            tail = value;
        } else {
            tail.next = value;
            value.prev = tail;
            tail = value;
        }
        length++;
    }

    // Insert at a specific position
    public void insertAtPoint(int val, int pos) {
        if (pos <= 0 || pos > length + 1) {
            System.out.println("Invalid position");
            return; // Invalid position
        }

        if (pos == 1) {
            insertAtFirst(val); // Insert at the start
        } else if (pos == length + 1) {
            insertAtEnd(val); // Insert at the end
        } else {
            Node value = new Node(val);
            Node current = head;
            for (int i = 1; i < pos - 1; i++) {
                current = current.next;
            }
            // Now current is at the (pos-1)th node
            value.next = current.next;
            value.prev = current;

            if (current.next != null) {
                current.next.prev = value;
            }
            current.next = value;
            length++; // Increase length when inserting
        }
    }

    // Get length of the list
    public int Length() {
        return length;
    }

    // Traverse the list
    public void traverse() {
        Node f = head;
        Node r = tail;
        if (f == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.println("PRINTING IN FORWARD:");
        while (f != null) {
            System.out.print(f.data + " -> ");
            f = f.next;
        }
       // System.out.println("\nPRINTING IN REVERSE:");
        //while (r != null) {
          //  System.out.print(r.data + " -> ");
            //r = r.prev;
        //}
        System.out.println(); // To make output cleaner
    }

    public void removeatfirst(){
        if(head==null) {
            System.out.println("List is empty, nothing to remove.");
            return;
        }
        else{
            head=head.next;
            head.prev=null;
            length--;
            if(head==null) {
                tail=null; // If the list is now empty, set tail to null as well
            }

        }
          }

          public void removeatlast()
          {
            if(head==null) return;
            tail=tail.prev;
            tail.next=null;
            length--;

          }

          public void removeatpoint(int pos)
          {
            if (head==null) return;

            else if(pos==1) {
                removeatfirst();
                return;
            }

            else if(pos==length)
            {
                removeatlast();
                return;
            }
            else{
                Node cur=head;;
                int x=1;
                while(x<pos-1)
                {
                    cur=cur.next;
                    x++;
                }
                cur.next=cur.next.next;
                cur.next.prev=cur;

            }


          }
          public void removeall()
          {
            head=null;
            tail=null;
            length=0;
          }
          
        



    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst(10);
        dll.insertAtFirst(9);
        dll.insertAtFirst(8);
        dll.insertAtFirst(7);
        dll.insertAtFirst(6);
        dll.insertAtEnd(11);

        dll.insertAtPoint(12, 6); // Insert 12 at position 7
        //dll.insertAtPoint(9, 4);  // Insert 9 at position 4
        System.out.println("\nLength is: " + dll.Length());
        dll.traverse();
        dll.removeall();
        System.out.println("After removing all elements:");
    
        dll.traverse();
    }
}

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
