public class ReverseString {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("Reversed string: " + reverseString.reverse("Hello World"));
    }
}