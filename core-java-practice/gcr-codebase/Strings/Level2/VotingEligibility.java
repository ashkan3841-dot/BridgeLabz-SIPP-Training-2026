import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < 10; i++) {

            boolean vote = age[i] >= 18;

            System.out.println(age[i] + "\t" + vote);
        }
    }
}