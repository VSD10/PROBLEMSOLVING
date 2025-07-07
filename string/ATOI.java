
class ATOI {
    public int myAtoi(String s) {
        if(s==null || s.length()==0)
        {
            return 0;
        }
        final int INT_MAX=Integer.MAX_VALUE;
        final int INT_MIN=Integer.MIN_VALUE;
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if(i==n)
        {
            return 0;
        }
        int sign=1;
        if(s.charAt(i)=='+')i++;
        else if(s.charAt(i)=='-')
        {
             sign=-1;
             i++;
        }
        long r=0;
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int d=s.charAt(i)-'0';
            r=r*10+d;
            if(sign *r<=INT_MIN) return INT_MIN;
            if(sign *r>=INT_MAX) return INT_MAX;
            i++;
            
        }
        return (int) (r*sign);
    }
    public static void main(String[] args){
        String str="42";
        System.out.println(new ATOI().myAtoi(str));
    }
    
}
