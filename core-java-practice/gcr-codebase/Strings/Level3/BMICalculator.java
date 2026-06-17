import java.util.Scanner;

public class BMICalculator {

    // b. Method to find BMI and Status of every person
    public static String[][] findBMIAndStatus(double[][] personData) {

        String[][] bmiData = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {

            double weight = personData[i][0];
            double heightCm = personData[i][1];

            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);

            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            bmiData[i][0] = String.valueOf(heightCm);
            bmiData[i][1] = String.valueOf(weight);
            bmiData[i][2] = String.valueOf(bmi);
            bmiData[i][3] = status;
        }

        return bmiData;
    }

    // c. Method that takes 2D array and stores height, weight, BMI and status
    public static String[][] generateReport(double[][] personData) {
        return findBMIAndStatus(personData);
    }

    // d. Display in tabular format
    public static void displayReport(String[][] report) {

        System.out.println("\n----------------------------------------------------------");
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {

            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t\t" +
                    report[i][3]
            );
        }
    }

    // e. Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. First column = Weight, Second column = Height
        double[][] personData = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter Details of Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] report = generateReport(personData);

        displayReport(report);

        sc.close();
    }
}