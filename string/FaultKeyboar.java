public class FaultKeyboar {
  
        public static String finalString(String s) {
          StringBuffer str=new StringBuffer();
         for(char a:s.toCharArray())
         {
            if(a=='i') str.reverse();
            else str.append(a);
         }
         return str.toString();
        }
   
        public static void main(String[] args) {
            String s="poiinter";
           // System.out.println("before"+s);
            s=finalString(s);
            System.out.println(s);
            
        }
}
