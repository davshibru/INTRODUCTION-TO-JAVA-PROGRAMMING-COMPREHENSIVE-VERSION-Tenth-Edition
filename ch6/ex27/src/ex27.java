public class ex27 {
    public static void main(String[] args) {
        final int NUMBER_OF_EMIRPS = 100;
        final int EMIRPS_PER_LINE = 10;

        int count = 0;
        int n = 2;


        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++;
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    public static boolean isEmirp(int num) {
        return PrimeNumberMethod.isPrime(num) &&
                isPalindrome(num) &&
                PrimeNumberMethod.isPrime(reverse(num));
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
