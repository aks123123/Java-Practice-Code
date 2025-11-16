public class Plindrame {
    public static void main(String[] args) {
        int n = 121;
        int original = n;   // keep a copy of original number
        int rev = 0;

        while (n != 0) {
            int dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }

        if (rev == original) {
            System.out.println(original + " is a palindrome number");
        } else {
            System.out.println(original + " is not a palindrome number");
        }
    }
}
