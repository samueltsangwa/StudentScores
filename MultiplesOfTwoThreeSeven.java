public class MultiplesOfTwoThreeSeven {
    public static void main(String[] args) {
        // Define the range
        int start = 71;
        int end = 150;

        // Displaying multiples of 2
        System.out.println("Multiples of 2 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for separation

        // Displaying multiples of 3
        System.out.println("Multiples of 3 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for separation

        // Displaying multiples of 7
        System.out.println("Multiples of 7 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line for separation
    }
}
