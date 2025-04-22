package linkedList;
class node{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class sll{
    private node head;
    public void insert(int data)
    {
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    public void print()
    {
        node current=head;
        System.out.println("The elements in the list are:");
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        sll list =new sll();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.print();
    }
}