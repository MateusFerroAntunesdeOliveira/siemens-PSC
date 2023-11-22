package question11;

public class Question11 {

    public static String reverseString(String input) {
        String output = "";
        char[] charArray = input.toCharArray();
        int size = charArray.length;

        for (int i = size - 1; i >= 0; i--) {
            output += charArray[i];
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.print("Type a String to Reverse: ");
        String input = System.console().readLine();

        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);
    }
}
