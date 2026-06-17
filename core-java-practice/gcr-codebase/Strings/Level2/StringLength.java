import java.util.Scanner;

public class StringLength {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        int myLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using charAt(): " + myLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}