
// This program finds the first and last occurrence of each character in a string
import java.util.HashMap; // Import HashMap
import java.util.Map;    // Import Map

class Main {
    public static void main(String[] args) {
        String a = "aabbcc";
        Map<Character, int[]> c = new HashMap<>(); // Corrected instantiation

        for (int x = 0; x < a.length(); x++) {
            char cc = a.charAt(x);
            if (c.containsKey(cc)) {
                // If the character is already in the map, update its last index
                c.get(cc)[1] = x;
            } else {
                // If it's a new character, put its first and current index
                c.put(cc, new int[]{x, x});
            }
        }

        // Print the results
        for (Map.Entry<Character, int[]> entry : c.entrySet()) {
            System.out.println("Character: " + entry.getKey() +
                               ", First Index: " + entry.getValue()[0] +
                               ", Last Index: " + entry.getValue()[1]);
        }
    }
}