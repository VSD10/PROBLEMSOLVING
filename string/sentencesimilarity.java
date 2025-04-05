/**
    * Determines whether two sentences are similar.
    *
    * @param sentence1 the first sentence
    * @param sentence2 the second sentence
    * @return true if the sentences are similar, false otherwise
    */
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        if (s1.length < s2.length) {
            String[] t = s1;
            s1 = s2;
            s2 = t;
        }
        int start = 0;
        int end = 0;
        while (start < s2.length && s1[start].equals(s2[start])) {
            start++;
        }
        while (end < s2.length && s1[s1.length - end - 1].equals(s2[s2.length - end - 1])) {
            end++;
        }

        return (start + end >= s2.length);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String sentence1 = "My name is John";
        String sentence2 = "My name is";
        boolean result = solution.areSentencesSimilar(sentence1, sentence2);
        System.out.println("Are sentences similar? " + result); // Expected output: true
    }
}