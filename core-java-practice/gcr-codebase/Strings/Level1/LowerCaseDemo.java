import java.util.Scanner;

public class LowerCaseDemo {

    static String myLower(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 32);

            result += ch;
        }

        return result;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String s1 = myLower(text);
        String s2 = text.toLowerCase();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(compare(s1, s2));
    }
}