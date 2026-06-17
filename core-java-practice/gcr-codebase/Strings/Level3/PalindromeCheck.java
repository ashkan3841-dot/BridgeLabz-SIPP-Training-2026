import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1
    static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    // Logic 2
    static boolean palindromeRecursion(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursion(text, start + 1, end - 1);
    }

    // Reverse String
    static char[] reverse(String text) {

        char[] rev = new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    // Logic 3
    static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverse(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Logic 1 : " + palindromeLoop(text));

        System.out.println("Logic 2 : " +
                palindromeRecursion(text, 0, text.length() - 1));

        System.out.println("Logic 3 : " + palindromeArray(text));
    }
}