public class Palindrome {
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println("Is 'racecar' a palindrome? " + isPalindrome("racecar"));
    }
}