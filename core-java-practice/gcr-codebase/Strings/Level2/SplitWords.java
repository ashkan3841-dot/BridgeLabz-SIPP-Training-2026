import java.util.Scanner;

public class SplitWords {

    static String[] mySplit(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] arr = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                arr[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }

        arr[index] = temp;
        return arr;
    }

    static boolean compare(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] arr1 = mySplit(text);
        String[] arr2 = text.split(" ");

        System.out.println("Arrays Same: " + compare(arr1, arr2));
    }
}