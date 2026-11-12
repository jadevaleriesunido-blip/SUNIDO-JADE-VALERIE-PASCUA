import java.util.Scanner;
import java.util.Arrays;

public class TransportationDelayTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] delays = new double[10];
        double total = 0;
        double longest = 0;
        int onTime = 0;
        int over15 = 0;

        System.out.println("========================================");
        System.out.println("       TRANSPORTATION DELAY TRACKER");
        System.out.println("========================================");
        System.out.println("        TRIP DELAY INFORMATION");
        System.out.println("----------------------------------------");

        // Input delays for 10 trips
        for (int i = 0; i < delays.length; i++) {

            System.out.print("Enter delay for Trip " + (i + 1) + " (minutes): ");
            delays[i] = input.nextDouble();

            // Validate negative values
            while (delays[i] < 0) {
                System.out.println("Invalid! Delay cannot be negative.");
                System.out.print("Enter delay again: ");
                delays[i] = input.nextDouble();
            }

            total += delays[i];

            if (delays[i] > longest) {
                longest = delays[i];
            }

            if (delays[i] == 0) {
                onTime++;
            }

            if (delays[i] > 15) {
                over15++;
            }
        }

        // Calculate average delay
        double average = total / delays.length;

        // Sort delays
        Arrays.sort(delays);

        // Display results
        System.out.println("\n========================================");
        System.out.println("              TRACKER RESULTS");
        System.out.println("========================================");

        System.out.printf("Average Delay        : %.2f minutes%n", average);
        System.out.printf("Longest Delay        : %.2f minutes%n", longest);
        System.out.println("On-Time Trips        : " + onTime);
        System.out.println("Delayed More Than 15 : " + over15);

        // Display descending order
        System.out.println("\n----------------------------------------");
        System.out.println("       DELAYS IN DESCENDING ORDER");
        System.out.println("----------------------------------------");

        for (int i = delays.length - 1; i >= 0; i--) {
            System.out.println((delays.length - i) + ". "
                    + delays[i] + " minutes");
        }

        // Ending design
        System.out.println("\n========================================");
        System.out.println("        THANK YOU FOR USING!");
        System.out.println("========================================");

        input.close();
    }
}