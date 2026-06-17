import java.util.Scanner;

public class CharacterType {

    static String check(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u')
            return "Vowel";

        if (ch >= 'a' && ch <= 'z')
            return "Consonant";

        return "Not Letter";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Char\tType");

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) +
                    "\t" + check(text.charAt(i)));
        }
    }
}