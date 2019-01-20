public class ex29 {
    public static void main(String[] args) {
        System.out.println();
        for (int p = 2; p < 1000; p++) {
            if (isTwinprime(p))
                System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }
    public static boolean isTwinprime(int num) {
        return PrimeNumberMethod.isPrime(num) && PrimeNumberMethod.isPrime(num + 2);
    }
}
