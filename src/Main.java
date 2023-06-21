// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class Main {
    public static void main(String[] args) {
        byte age = 27;
        long viewsCount = 123_889_887L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;
        System.out.println();
    }
}
 */

/*
import java.util.Date;

public class Main {
    public static void main(String[]arg) {
        byte age =27;
        Date now = new Date();
        //for (int i = 0; i < ; i++){}
        System.out.println(now);
    }
}
*/


import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

//public class Main {
   // public static void main(String[]arg) {
        //byte x = 2;
        //byte y = x;
        //x=2;
        // resulted in no change in x

        //Point point1 = new Point(1, 1);
        //Point point2 = point1;
        //point1.x = 2;
        // this resulted in a change of x

        /*
        String message = "Hello World" + " Im here to Take over ";
        String message2 = "Hello \"John\""; // adding quote to string
        String message3 = "c:\\Windows\\....";
        System.out.println(message.endsWith("over"));
        System.out.println(message.length());
        System.out.println(message.replace("over", "power" ));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message3);
        System.out.println(message2);
        */

        /*
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);
        */


        /*
        // array
        int[] numbers = {2, 3, 4, 5, 1, 4};
        Arrays.sort(numbers);
        //multi dimensional array
        int[][] numbers2 = new int[2][3];
        numbers2[0][0] = 1;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers)); //must print array to string
        System.out.println(Arrays.deepToString(numbers2)); // print multiDimensional to string
        int[][] numbers = { {1, 2, 3}, {4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
         */

        /*
        int result = 10 - 3; // you can add subtract multiple and divide
        double result2 = (double)10 / (double)3;// turning division into float
        int x = 1; //increment
        //++x;
        int y = ++x; // ++x and x++ have different effects
        System.out.println(result);
        System.out.println(result2);
        System.out.println(x);
        System.out.println(y);

        int n = 1;
        n += 2; // you can do -= *= /=
        System.out.println(n);

        int d = 10 + 3 * 2; //Pemdas order of operations
        System.out.println(d);
        */

        /*
        //implicit casting, casting happens automatically when no chace of data loss
        //byte > short > int > long float > double
        short x = 1;
        int y = x + 2;
        double g = 1.2;
        int d = (int)g + 2;
        // important converting things into string, Text inputs, all frontend stuff pretty much
        //comes in strings and you need to manage that
        String b = "1.1";
        //int c = Integer.parseInt(b) + 2;
        double f = Double.parseDouble(b) +2;
        System.out.println(y);
        System.out.println(d);
        //System.out.println(c);
        System.out.println(f);

         */

        /*
        int result = Math.round(1.1F);
        int result2 = (int)Math.ceil(1.3);
        int result3 = (int)Math.floor(1.2F);
        int result4 = Math.max(1, 2);
        double result5 = Math.random() * 100; // will print a random number from 0-100
        double result6 = Math.round(Math.random() * 100);
        double result7 = (Math.random() * 100);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        */

        /*
        // format things
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123451245667.865);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(1.2);
        System.out.println(result2);

        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

         */

        /*
        //Handing inputs
        Scanner scanner = new Scanner((System.in));
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);

        Scanner scanner1 = new Scanner((System.in));
        System.out.print("Name: ");
        String name = scanner1.nextLine();
        System.out.println("You are " + name);

        */
        /*
        // monthlyPayment
        // P is principal
        // r your monthly interest rate
        // n is your number of payments
        For example, imagine you have a $100,000 mortgage loan with 6
        percent annual interest over 15 years. Your input for "P" would be $100,000.
        For "r," you would use your monthly interest rate,
        which would be 0.06 (6 percent) divided by 12, or 0.005 (0.5 percent).
        For "n" you would use your total number of payments,
        one for each month in fifteen years, which would be 12*15, or 180.

         */


    //}
//}

//Mortgage Calculator
//my own algorithm 0 help
// monthlyPayment
// P is principal
// r your monthly interest rate
// n is your number of payments
/*
For example, imagine you have a $100,000 mortgage loan with 6
        percent annual interest over 15 years. Your input for "P" would be $100,000.
        For "r," you would use your monthly interest rate,
        which would be 0.06 (6 percent) divided by 12, or 0.005 (0.5 percent).
        For "n" you would use your total number of payments,
        one for each month in fifteen years, which would be 12*15, or 180.

 */


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
