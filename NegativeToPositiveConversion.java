package homeassingments.weekday1;

public class NegativeToPositiveConversion {

    public static void main(String[] args) {
        int number = -40;

        // Check if the number is negative
        if (number < 0) {
            // Convert the negative number to positive
            int positiveNumber = -number;

            // Print the result
            System.out.println("The number " + number + " is converted to " + positiveNumber);
        } else {
            // If the number is already positive, print as is
            System.out.println("The number " + number + " is already positive");
        }
    }
}

