package bank;

public class FectorialRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        }
        return n * factorial(n - 1); // recursive call
    }
    public static void main(String[] args) {
        int n = 5; // Example
        int result = factorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }
}
