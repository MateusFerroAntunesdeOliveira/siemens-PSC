package question10;

public class Question10 {

    public static int evaluateLengthString(String input) {
        int size = 0;
        char[] charArray = input.toCharArray();
        
        while (charArray[size] != '\0') {
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.print("Type a String: ");
        String input = System.console().readLine();

        // Add a null character to the end of the string
        input += '\0';
        int size = evaluateLengthString(input);
        System.out.println("Length: " + size);
    }
}
