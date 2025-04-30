class happynumber {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        return slow==1;        
    }
    private int square(int n)
    {
        int o=0;
        while(n>0)
        {
            int r=n%10;
            o+=r*r;
            n/=10;
        }
        return o;
    }
    public static void main(String[] args) {
        int n = 19; // Example input
        happynumber hn = new happynumber();
        System.out.println(hn.isHappy(n)); // Output: true
    }
}