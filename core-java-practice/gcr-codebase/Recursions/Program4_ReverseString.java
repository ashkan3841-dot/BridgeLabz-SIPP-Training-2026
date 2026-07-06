import java.util.*;
public class Program4_ReverseString{

    static void reverse(String s, int i) {
        if (i < 0)
            return;

        System.out.print(s.charAt(i));
        reverse(s, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        reverse(s, s.length() - 1);
        sc.close();
    }
}
    

