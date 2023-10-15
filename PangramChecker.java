public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input string
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase(); // Convert the input to lowercase for case insensitivity
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letterUsed : alphabet) {
            if (!letterUsed) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from 'a' to 'z' were found
    }
}
