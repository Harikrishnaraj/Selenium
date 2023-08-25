package homeassingments.weekday2;

public class Fibonacci {

    public static void main(String[] args) {
        int firstNum = 0;
        int secNum = 1;
        int sum = 0;

        System.out.println(firstNum); // Printing the first number (0)

        for (int i = 1; i <= 11; i++) {
            sum = firstNum + secNum;
            firstNum = secNum;
            secNum = sum;
            System.out.println(sum); // Printing the current sum (Fibonacci number)
        }
    }
}
