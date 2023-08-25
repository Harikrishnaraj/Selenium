package homeassingments.weekday2;

public class IsPrime {

    public static void main(String[] args) {
        // You can change the value of n to test different numbers
        int n = 17; // Change this to the number you want to check
        
        boolean isPrime = isPrime(n);
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number between 2 and n-1, it's not prime
            }
        }
        
        return true; // If no number between 2 and n-1 divides n, it's prime
    }
}

