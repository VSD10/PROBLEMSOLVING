class stringmultiply {
    public String multiply(String num1, String num2) {  
        if (num1.equals("0") || num2.equals("0")) return "0"; // If either number is 0, return 0
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2]; // Result can be at most len1 + len2 digits

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                //System.out.println(mul);
                int sum = mul + result[i + j + 1];
                System.out.println(sum); // Add to the current position in the result
                result[i + j + 1] = sum % 10; // Store the unit place
                result[i + j] += sum / 10; // Carry over to the next position
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { // Skip leading zeros
                sb.append(num);
            }
        }
        return sb.toString(); // Convert StringBuilder to String and return
    }

    
    public static void main(String[] args) {
        stringmultiply sm = new stringmultiply();
        String num1 = "123";
        String num2 = "456";
        String result = sm.multiply(num1, num2);
        System.out.println("Result: " + result); // Expected output: 56088
    }

}