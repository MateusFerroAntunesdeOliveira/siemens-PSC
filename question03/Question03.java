// For each multiple of 3, print "Foo" instead of the number.
// For each multiple of 5, print "Baa" instead of the number.
// For multiple numbers simultaneously of 3 and 5, print "FooBaa", instead of the number.
// Your Solution should be using as few lines of code as possible, but you should produce efficient code.

package question03;

public class Question03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Foo";
            }
            if (i % 5 == 0) {
                output += "Baa";
            }
            // If output is empty, print the number
            if (output.equals("")) {
                output += i;
            }
            System.out.println(output);
        }
    }
}
