public class ReverseonlyLetters {
    public static void swap(StringBuffer s,int st,int end)
    {
        char e=s.charAt(end);
        s.setCharAt(end, s.charAt(st));
        s.setCharAt(st, e);
    }
    public static void main(String[]args)
    {
       // String str="ab-cd";//dc-ba
        String str="a-bC-dEf-ghlj";//
        StringBuffer s=new StringBuffer(str);
        int start=0;
        int end=s.length()-1;
        // System.out.println(Character.isAlphabetic(s.charAt(start)));
        // System.out.println(
        //     Character.isAlphabetic(end)
        // );
        while(start<end)
        {
            if(Character.isAlphabetic(s.charAt(start))==true)
            {
                if(Character.isAlphabetic(s.charAt(end)))
                {
                    // System.out.println(3);
                    swap(s,start,end);
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }

        System.out.println(s);
    }
}