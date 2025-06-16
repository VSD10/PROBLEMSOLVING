
// This Java program checks if a given string contains all letters from 'a' to 'z'.
// It uses a boolean array to track the presence of each letter, which is more efficient than using a HashMap or Set for this specific task.
class Main {
    public static void main(String[] args) {
        String a1 = "abcdefghijklmnopqrstuvwxyz";
        // Convert the string to a character array (though not strictly needed for this approach)
        // char[] ch = a1.toCharArray(); // This line is not directly used in the optimized check below

        // Create a boolean array to mark the presence of each letter 'a' through 'z'.
        // index 0 for 'a', index 1 for 'b', etc.
        boolean[] present = new boolean[26];

        // Iterate through the input string and mark characters as present
        for (int i = 0; i < a1.length(); i++) {
            char currentChar = a1.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                present[currentChar - 'a'] = true;
            }
            // You might add an else if for uppercase if your string can contain them
            // else if (currentChar >= 'A' && currentChar <= 'Z') {
            //     present[currentChar - 'A'] = true;
            // }
        }

        // Now, check if all 26 letters are marked as present
        boolean allLettersPresent = true;
        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                allLettersPresent = false;
                break; // Found a missing letter, no need to check further
            }
        }

        if (allLettersPresent) {
            System.out.println("All letters from 'a' to 'z' are present.");
            // Or if you want to output 'true' for a boolean check
            // System.out.println(true);
        } else {
            System.out.println("Not all letters from 'a' to 'z' are present.");
            // Or if you want to output 'false' for a boolean check
            // System.out.println(false);
        }
    }
} 
