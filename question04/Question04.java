package question04;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nStarting String (S): ");
        String s = scanner.next();
        System.out.print("Desired String (T): ");
        String t = scanner.next();
        System.out.print("Movements (K): ");
        int k = scanner.nextInt();

        if (concatRemove(s, t, k)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    public static boolean concatRemove(String s, String t, int k) {
        int commonLength = 0;

        // Find the common length of the strings
        // For example: s = "abc" and t = "abcd", the commonLength will be 3
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }

        // If the total operations is less than or equal to k and the difference
        // For example: s = "abc" and t = "abcd", the totalOperations will be 1
        // Because (s.length() - commonLength = 3 - 3 = 0) and (t.length() - commonLength = 4 - 3 = 1)
        int totalOperations = s.length() - commonLength + t.length() - commonLength;

        // If the total operations is less than or equal to k and the difference between k and total operations is even
        //      > Return true and can transform S to T
        // If k is greater than or equal to the sum of the lengths of S and T
        //      > Return true because there is sufficient margin to carry out the operations
        // Otherwise
        //      > Return false
        return (totalOperations <= k && (k - totalOperations) % 2 == 0) || (k >= s.length() + t.length());
    }
}
