package linkedList;
class Node{
    int data;
    Node next;
     Node (int d){
        data=d;
        next=null;
    }
}
class Circularll{
    Node head;
    Node tail;
    public  void insertatfir(int val1){
        Node val= new Node(val1);
        if(head==null){
            head=val;
            tail=val;
            tail.next=head;
        }
        else{
            val.next=head;
            head=val;
            tail.next=head;
        }
    }
    public  void insertatsec(int val1)
    {
        Node val = new Node(val1);
        if (tail==null)
        {
            head=val;
            tail=val;
            tail.next=val;
        }
        else{
            val.next=tail.next;
            tail.next=val;
            tail=val;

        }
    }
    public  void traverse(){
        Node cur=head;
        do{
            System.out.print(cur.data+" -> ");
            cur=cur.next;
        }while(cur!=head);
    }

    public static void main(String[] args){
        
        
        Circularll cll = new Circularll();
        cll.insertatfir(1); // Insert at front
        cll.insertatsec(2); // Insert at end
        cll.insertatsec(3);
        cll.insertatfir(0);
        cll.traverse();

    }
}