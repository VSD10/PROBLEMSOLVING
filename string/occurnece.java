public // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String a = "aabbcccdddeeee";
        // Initialize an array to store character counts.
        // Size 26 for 'a' through 'z'.
        int[] hash = new int[26];

        // Loop through each character in the string
        for (int x = 0; x < a.length(); x++) {
            char currentChar = a.charAt(x); // Correct method to get char
            
            // Check if the character is a lowercase English alphabet letter
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Calculate the index for the hash array (0 for 'a', 1 for 'b', etc.)
                int index = currentChar - 'a';
                hash[index]++; // Increment the count for that character
            }
        }

        // Loop through the hash array to print the occurrences
        for (int x = 0; x < 26; x++) {
            int count = hash[x];
            // Convert the index back to a character
            char character = (char) ('a' + x); 
            
            // Only print if the character appeared at least once
            if (count > 0) {
                System.out.println("The character '" + character + "' occurrences = " + count);
            }
        }
    }
} 
