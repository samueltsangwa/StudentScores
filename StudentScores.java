import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // An Array to store the scores
        double[] marks = new double[5];

        // Ask the student to enter scores for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate the sum of the marks
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }

        // Computing the average
        double average = sum / 5;

        // Display the average with two decimal places
        System.out.printf("The average marks are: %.2f\n", average);

        // Close the scanner
        scanner.close();
    }
}
