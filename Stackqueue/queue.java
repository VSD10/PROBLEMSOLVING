public class queue{
    public static void main(String[]args)
    {
        ss q=new ss();
        q.push(0);
        q.push(1);
        q.push(2);
        q.pop();
        q.peek();
        q.size();

    }
}
class ss{
    int s=1000;
    int arr[]=new int[s];
    int start=0,end=-1;
    void push(int x)
    {
        end++;
        arr[end]=x;
    }
    void peek()
    {
        System.out.println(arr[start]);

    }
    void pop()
    {
        int pop=arr[start];
        start++;
        System.out.println("pop"+ pop);

    }
    void size()
    {
        System.out.println(end+1);
    }

}