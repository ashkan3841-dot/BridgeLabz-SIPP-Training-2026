import java.util.Scanner;

public class MyTrim {

    static String myTrim(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ')
            start++;

        while (end >= start && str.charAt(end) == ' ')
            end--;

        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String s1 = myTrim(text);
        String s2 = text.trim();

        System.out.println("Custom : " + s1);
        System.out.println("BuiltIn: " + s2);
        System.out.println(s1.equals(s2));
    }
}