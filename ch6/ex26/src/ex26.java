public class ex26 {
    public static void main(String[] args) {
        final int numberPalindromic = 100;
        final int numb = 10;
        int count = 0;
        int n = 2;

        while (count < numberPalindromic) {
            if (isPalindromicPrime(n)) {
                count++;
                System.out.print(count % numb == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }
    public static boolean isPalindromicPrime(int num) {
        return PrimeNumberMethod.isPrime(num) &&
                isPalindrome(num);
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }
    public static int reverse(int number) {
        String reverse = "";
        String n = number + "";
        for (int i = n.length() - 1; i >= 0; i--) {
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}
