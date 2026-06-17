import java.util.Scanner;

public class WordLength2D {

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static String[][] getData(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = getData(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" +
                    Integer.parseInt(data[i][1]));
        }
    }
}