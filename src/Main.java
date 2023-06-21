
import java.text.NumberFormat; // Import the NumberFormat class for formatting the mortgage as currency
import java.util.Scanner; // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Use a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt(); // Get the principal amount from the user

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat(); // Get the annual interest rate from the user
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR; // Convert the annual interest rate to monthly interest rate

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte(); // Get the loan period in years from the user
        int numberOfPayments = years * MONTHS_IN_YEAR; // Calculate the total number of payments

        // Calculate the mortgage payment using the formula: M = P * (r * (1+r)^n) / ((1+r)^n - 1)
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        // Format the mortgage value as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        // Print the result
        System.out.println("Mortgage: " + mortgageFormatted);

        scanner.close(); // Close the scanner to release resources
    }
}
