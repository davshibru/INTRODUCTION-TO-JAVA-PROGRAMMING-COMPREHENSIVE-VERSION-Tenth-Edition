import java.util.Scanner;

public class ch6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("6.1");
        int numbersOfPentogonal = 100;
        int Int = 10;

        System.out.println("The first 100 pentagonal numbers, ten per line: ");

        for (int i = 1; i <= numbersOfPentogonal; i++) {
            // Print ten numbers per line
            if (i % numbersOfPentogonal == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }
    }

}
