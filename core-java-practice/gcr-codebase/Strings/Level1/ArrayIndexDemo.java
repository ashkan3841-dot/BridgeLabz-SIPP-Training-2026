import java.util.Scanner;

public class ArrayIndexDemo {

    static void handle(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }

        handle(names);
    }
}