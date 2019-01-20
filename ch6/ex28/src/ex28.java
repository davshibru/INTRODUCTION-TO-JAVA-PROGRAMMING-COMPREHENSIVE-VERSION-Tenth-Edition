public class ex28 {
    public static void main(String[] args) {
        System.out.println("\np\t\t\t2^p-1");
        System.out.println("--------------------");

        for (int p = 2; p <= 31; p++) {
            if (PrimeNumberMethod.isPrime(p)) {
                System.out.printf("%-13d", p);
                System.out.println(mersennePrime(p));
            }
        }
    }
    public static int mersennePrime(int num) {
        return (int)Math.pow(2, num) - 1;
    }
}
