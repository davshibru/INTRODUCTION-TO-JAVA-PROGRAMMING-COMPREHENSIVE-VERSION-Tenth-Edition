public class ex12 {
    public static void main(String[] args) {

        int number = 10;
        char ch1 = '1';
        char ch2 = 'Z';

        System.out.println("Characters per 1 to Z");
        printChars(ch1, ch2, number);
        System.out.println();
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (char c = ch1, count = 1; c <= ch2; c++, count++) {
            if (count % numberPerLine == 0)
                System.out.println(c);
            else
                System.out.print(c + " ");
        }
    }
}
