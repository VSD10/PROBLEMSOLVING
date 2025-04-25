package linkedList;
import java.util.Scanner;

class Node{
    int data;
    Node next;
 Node(int d)
    {
        data=d;
        next=null;
    }
}
class SinglyLinkedList{
    Node head;

    public void insertatfirst(int d)
    {
        Node n=new Node(d);
        if(head==null)
        { 
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
        System.out.println();
        System.out.println("Inserted the value "+d);
        
    }
    public void insertatend(int d)
    {
        Node n=new Node(d);
        Node c=head;
        while(c.next!=null)
        {
            c=c.next;
        }
        c.next=n;
        
        System.out.println();
        System.out.println("Inserted the value "+d);
    }
    public void insertatpos(int d,int p)
    {
        Node n=new Node(d);
        Node c=head;
        for(int x=1;x<p;x++)
            c=c.next;
        n.next=c.next;
        c.next=n;
          System.out.println();
        System.out.println("Inserted the value "+d);

        
    }
    public void deleteatfirst()
    {
        if(head==null)System.out.println("the head is null and no need to delete");
        else{
            head=head.next;
        }
          System.out.println();
        System.out.println("Deleted the value ");
    }

public void deleteatpos(int p)
    {
        Node c=head;
        for(int x=1;x<p;x++)
            c=c.next;
        c.next=c.next.next;
          System.out.println();
        System.out.println("Deleted the value");   
    }
    public void deleteatend(){
       if(head==null)System.out.println("the head is null and no need to delete");
       else{
        Node c=head;
        while(c.next.next!=null)
        {
            c=c.next;
        }
        c.next=null;
       }
         System.out.println();
        System.out.println("Deleted the value");
    }
    public void findmid()
    {
        Node fast=head.next;
        Node slow=head;
        while(fast!=null && fast.next !=null)
        {
            fast=fast.next.next;
            slow=slow.next;

        }
        System.out.println("the middle value of the linkedlist is "+ slow.data);
    }
    public void length()
    {
        Node c=head;
        int count=0;
        while(c!=null)
        {
            count++;
            c=c.next;
        }
        System.out.println("The length of the linkedlist is "+count);
    }


    public void traverse()
    {
        Node c=head;
        while(c!=null)
        {
            System.out.print(c.data+ " -> ");
            c=c.next;
        }
        System.out.println();
    }
    public  static void  main(String[] args)
    {
        SinglyLinkedList sll=new SinglyLinkedList();
        Scanner scan=new Scanner(System.in);
        System.out.println("\t\t\t\t\t WELCOME TO THE LINKEDLIST MANAGEMENT");
        int e=1;
        while(e==1)
        { 

        System.out.println("SELECT FROM THE OPTIONS: \n 1.Insert At First \n 2.Insert at Some Point \n 3.Insert at End \n 4.Find the Middle Element \n 5.Delete at End \n 6.Delete at Some Point \n 7. Delete at End \n 8. Traverse the LinkedList \n 9.Find the Length of the LinkedList \n 10.Exit");
        int o=scan.nextInt();
        String[] arr={"First","At Some Point","End"};
        int value=0,pos=0;
        if(o<4){
                System.out.println("Enter the Element to Insert at "+arr[o-1]);
                value=scan.nextInt();    
                if(o==2){
                    System.out.println("Enter the Position to Insert value "+value);
                pos=scan.nextInt();    
                } 
        }
        switch(o){
            case 1:
                sll.insertatfirst(value);
                break;
            case 2:
                sll.insertatpos(value,pos);
                break;
            case 3:
                sll.insertatend(value);
                break;
            case 4:
                sll.findmid();
                break;
            case 5:
                sll.deleteatfirst();
                break;
            case 6:
                System.out.println("Enter the Position to Delete value ");
                int p=scan.nextInt();
                sll.deleteatpos(p);
                break;
            case 7:
                sll.deleteatend();
                break;
            case 8:
                sll.traverse();
                break;
            case 9:
                sll.length();
                break;
            default:
                System.out.print("Select the Valid Option");
                break;
        }
        System.out.print("Would You like to Continue? \n 1.Yes \n 2.No");
        e=scan.nextInt();

        
        }
    }
}
  