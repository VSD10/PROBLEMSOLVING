import java.util.*;
class Sorting{
    public static void main(String[] args) {
        String[] str={"jackfruit","banana","apple","orange","guava"};
        
        for(int x=0;x<str.length;x++)
        {
            for(int y=1;y<str.length;y++)
            {
                
                if(str[y].compareTo(str[y-1])<0)
                {
                    String t=str[y-1];
                    str[y-1]=str[y];
                    str[y]=t;
                }

            }
        }
        for(String x:str)System.out.println(x);

    }
}