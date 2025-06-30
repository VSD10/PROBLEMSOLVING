class stack{
    public static void main(String[]args)
    {
        operation s=new operation();
        s.size();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.top();
        s.print();
        s.remove();
       // s.print();


        
    }
    
}
class operation{
    int size=1000;
    int arr[]=new int[size];
    int top=-1;

    void print()
    {
        for(int x=0;x<=top;x++)
        {
            System.out.print(arr[x]);
        }
    }
    void push(int x)

    {
        top++;
        arr[top]=x;
    }
    void size()
    {
        System.out.println(top+1);
    }
    void top()
    {
        System.out.println(top+1);
    }
    void remove()
    {
        int x=arr[top];
        top--;
    }
}