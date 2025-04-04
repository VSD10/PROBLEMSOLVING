class stringreverse {
    public void reverseString(char[] s) {
        int len=s.length;
        int start=0;
        int end=len-1;
        for(int i=0;i<len;i++)
        {
            char t=s[start];
            s[start]=s[end];
            s[end]=t;

        }
        
    }
    public static void main(String[] args) {
        stringreverse solution = new stringreverse();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        System.out.println(s); // Expected output: "olleh"
    }

}