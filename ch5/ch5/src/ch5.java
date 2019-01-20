import java.util.Scanner;

public class ch5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("5.1");

        int positives = 0;
        int negatives = 0;
        int coulic = 0;
        double total = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            while (number != 0) {
                if (number > 0)
                    positives++;
                else
                    negatives++;
                total += number;
                coulic++;
                number = input.nextInt();
            }
            double average = total / coulic;

            System.out.println(
                    "The number of positive is " + positives + "\nThe number of negatives is " + negatives + "\nThe total is total " + total + "\nThe average is " + average);
        }

        System.out.println("___________________________________________");


        System.out.println("5.2");

        final int NumberOfQuestions = 10;
        int correctCount = 0;
        int colich = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";

        while (colich< NumberOfQuestions) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math.random() * 15);

            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else
                System.out.println("Your answer is wrong. " + number1 + " + " + number2 + " should be " + (number1 + number2));
            colich++;
            output += "\n" + number1 + "+" + number2 + "=" + answer;
            if (number1 + number2 == answer)
                output += " correct";
            else
                output += " wrong";
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds" + "\n" + output);

        System.out.println("__________________________________________________");


        System.out.println("5.3");

        final double PoundsPerKilogram = 2.2;

        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%-15d%6.1f\n", i, (i * PoundsPerKilogram));
        }

        System.out.println("_____________________________________________________");


        System.out.println("5.4");

        final double KilometersPerMile = 1.609;


        System.out.println("Miles        Kilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.printf(
                    "%-13d%-10.3f\n", i, (i * KilometersPerMile));
        }

        System.out.println("______________________________________________________");


        System.out.println("5.5");

        final double PoundsPerKilograme = 2.2;

        System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf("%-12d%7.1f", k, (k * PoundsPerKilogram));
            System.out.print("     |     ");
            System.out.printf("%-9d%12.2f\n", p, (p / PoundsPerKilogram));
        }

        System.out.println("______________________________________________________");


        System.out.println("5.6");

        final double KilometersPerMile_2 = 1.609;

        System.out.println("Miles      Kilometers   |   Kilometers     Miles     ");

        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.printf("%-11d%-10.3f", m, (m * KilometersPerMile_2));
            System.out.print("   |   ");
            System.out.printf("%-15d%-6.3f\n", k, (k / KilometersPerMile_2));
        }

        System.out.println("_______________________________________________________");


        System.out.println("5.8");

        int totalCost = 0;
        int tuition = 10000;
        int tuitionTenthYear = 0;

        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);

            if (year > 10)
                totalCost += tuition;

            if (year == 10)
                tuitionTenthYear = tuition;
        }
        System.out.println("Tuition in ten years: $" + tuitionTenthYear);

        System.out.println("Total cost for four years' worth of tuition" + " after the tenth year: $" + totalCost);

        System.out.println("_______________________________________________________");


        System.out.println("5.9");

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int score;
        int highest = 0;
        int secondHigest = 0;

        String name = "";
        String student1 = "";
        String student2 = "";

        System.out.println("Enter each students' name and score:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print(
                    "Student: " + (i + 1) + "\n   Name: ");
            name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if (i == 0) {
                highest = score;
                student1 = name;
            }
            else if (i == 1 && score > highest) {
                secondHigest = highest;
                highest = score;
                student2 = student1;
                student1 = name;
            }
            else if (i == 1) {
                secondHigest = score;
                student2 = name;
            }
            else if (i > 1 && score > highest && score > secondHigest) {
                secondHigest = highest;
                student2 = student1;
                highest = score;
                student1 = name;
            }
            else if (i > 1 && score > secondHigest) {
                student2 = name;
                secondHigest = score;
            }

        }
        System.out.println("the student with the highest score: " + student1 + "\nthe student with the second-highest score: " + student2);

        System.out.println("___________________________________________________");


        System.out.println("5.10");

        final int NumbersPerLine = 10;
        int col = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                col++;
                if (col % NumbersPerLine == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }

        System.out.println("_____________________________________________________");


        System.out.println("5.11");

        final int Numb = 10;

        int c = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                c++;
                if (c % Numb == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }


        System.out.println("____________________________________________________");


        System.out.println("5.12");

        int n = 0;

        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);

        System.out.println("_____________________________________________________");


        System.out.println("5.13");

        n = 0;

        while (Math.pow(n + 1, 3) < 12000) {
            n++;
        }
        System.out.println("Largest integer n such that n^3 is less than 12,000: " + n);

        System.out.println("_____________________________________________________");


        System.out.println("5.14");

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
        int gcd = 0;

        if (n1 < n2){
            gcd = n1;
        }
        else {
            gcd = n2;
        }

        while (n1 % gcd != 0 || n2 % gcd != 0) {
            gcd--;
        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);

        System.out.println("___________________________________________________");


        System.out.println("5.15");

        int chis = 10;
        col = 0;

        for (int i = 33; i <= 126; i++) {
            col++;

            if (col % 10 == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }

        System.out.println("___________________________________________________");


        System.out.println("5.16");

        System.out.print("Enter an integer: ");
        number = input.nextInt();
        int index = 2;

        while (number / index != 1) {
            if (number % index  == 0) {
                System.out.print(index + ", ");
                number /= index;
            }
            else
                index++;
        }
        System.out.println(number + ".");

        System.out.println("__________________________________________________");


        System.out.println("5.17");

        System.out.print("Enter the number of lines: ");
        int numberOfLines = input.nextInt();

        for (int rows = 1; rows <= numberOfLines; rows++) {
            for (int s = numberOfLines - rows; s >= 1; s--) {
                System.out.print("  ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
        }

        System.out.println("__________________________________________________");


        System.out.println("5.18");

        System.out.println("select pattern 1- A, 2- B, 3- C, 4- D");
        int pattern = input.nextInt();
        switch (pattern) {
            case 1:
                System.out.println("Pattern A");
                for (int rows = 1; rows <= 6; rows++) {
                    for (int cols = 1; cols <= rows; cols++) {
                        System.out.print(cols + " ");
                    }
                }
                break;
            case 2:
                System.out.println("Pattern B");
                for (int r = 6; r >= 1; r--) {
                    for (int p = 1; p <= r; p++) {
                        System.out.print(p + " ");
                    }
                }
                break;
            case 3:
                int numberLines = 6;
                System.out.println("Pattern C");
                for (int rows = 1; rows <= numberLines; rows++) {
                    for (int s = numberLines - rows; s >= 1; s--) {
                        System.out.print("  ");
                    }
                    for (int m = rows; m >= 1; m--) {
                        System.out.print(m + " ");
                    }
                }
                break;
            case 4:
                System.out.println("Pattern D");
                for (int rows = 0; rows < 6; rows++) {
                    for (int ws = 0; ws < rows; ws++) {
                        System.out.print("  ");
                    }
                    for (int cl = 0; cl < 6 - rows; col++) {
                        System.out.print((cl + 1) + " ");
                    }
                }
        }

        System.out.println("______________________________________________");


        System.out.println("5.19");

        int start = 0;
        int end = 7;

        for (int row = 1; row <= 128; row += row) {

            for (int startSpace = 0; startSpace < end; startSpace++) {
                System.out.print("    ");
            }
            for (int l = 1; l <= row; l += l) {
                System.out.printf("%4d", (l));
            }
            for (int r = start; r > 0 ; r /= 2 ) {
                System.out.printf("%4d", (r));
            }
            end--;
            start = row;
        }

        System.out.println("_____________________________________________");


        System.out.println("5.20");

        number = 8;
        col = 0;

        System.out.println("The prime numbers between 2 and 1,000, inclusive are");

        for (int numb = 2; numb <= 1000; numb++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= numb / 2; divisor++) {
                if (numb % divisor == 0)
                    break;
            }
            if (isPrime) {
                col++;
                if (col % number == 0) {
                    System.out.println(numb);
                }
                else
                    System.out.print(numb + " ");
            }
        }

        System.out.println("________________________________________________");


        System.out.println("5.21");

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double i = 5.0; i <= 8; i += 0.125) {
            System.out.printf("%-5.3f", i);
            System.out.print("%           ");
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            System.out.printf("%-19.2f", monthlyPayment);
            System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears);
        }

        System.out.println("________________________________________________");


        System.out.println("5.22");

        System.out.print("Loan Amount: ");
        loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();

        double monthlyRate = annualRate / 1200;
        double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

        double balance = loanAmount;
        double principal;
        double interest;

        System.out.println("Payment#     Interest     Principal     Balance");
        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interest, principal, balance);
        }

        System.out.println("_________________________________________________");


        System.out.println("5.23");

        double sumLeftToRight = 0.0;
        for (double i = 1.0; i <= 50000.0; i++) {
            sumLeftToRight += 1 / i;
        }

        System.out.println("Summation of series left to right: " + sumLeftToRight);

        double sumRightToLeft = 0.0;
        for (double i = 50000.0; i >= 1.0; i--) {
            sumRightToLeft += 1 / i;
        }

        System.out.println("Summation of series right to left: " + sumRightToLeft);
        System.out.println("Summation of the series right to left - " + "Summation of the series left to right: " + (sumRightToLeft - sumLeftToRight));

        System.out.println("__________________________________________________");


        System.out.println("5.24");

        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        double pi = 4 * sum;

        System.out.println("PI value for i = 10000: " + pi);

        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        System.out.println("PI value for i = 20000: " + pi);

        sum = 0;
        value = 100000.0;
        for (double d = 1; d <= (2 * value - 1); d += 2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 / d;
        }
        pi = 4 * sum;

        System.out.println("PI value for i = 100000: " + pi);

        System.out.println("_____________________________________________");


        System.out.println("5.26");

        double e = 0.0;
        value = 10000.0;

        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }

        System.out.println("The e value for i = 10000: " + e);

        e = 0.0;
        value = 20000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }

        System.out.println("The e value for i = 20000: " + e);

        e = 0.0;
        value = 100000.0;
        for (double i = 1; i <= value; i++) {
            double denominator = i;
            for (double k = i - 1; k >= 1; k--) {
                denominator *= k;
            }
            e += 1 / denominator;
        }

        System.out.println("The e value for i = 100000: " + e);

        System.out.println("________________________________________________");


        System.out.println("5.27");

        System.out.println("All the leap years from 101 to 2100:");
        c = 0;
        for (int year = 101; year <= 2100; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                c++;
                System.out.print(year + (c % 10 == 0 ? "\n" : " "));
            }
        }

        System.out.println("_________________________________________________");


        System.out.println("5.28");

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int day = input.nextInt();

        String str;

        for (int month = 1; month <= 12; month++) {
            str = "";
            switch (month) {
                case 1: str += "January "; break;
                case 2: str += "February "; break;
                case 3: str += "March "; break;
                case 4: str += "April "; break;
                case 5: str += "May "; break;
                case 6: str += "June "; break;
                case 7: str += "July "; break;
                case 8: str += "August "; break;
                case 9: str += "September "; break;
                case 10: str += "October "; break;
                case 11: str += "November "; break;
                case 12: str += "December "; break;
            }
            str += "1, " + year + " is ";

            day %= 7;

            switch (day) {
                case 0: System.out.println(str + "Sunday"); break;
                case 1: System.out.println(str + "Monday"); break;
                case 2: System.out.println(str + "Tuesday"); break;
                case 3: System.out.println(str + "Wednesday"); break;
                case 4: System.out.println(str + "Thursday"); break;
                case 5: System.out.println(str + "Friday"); break;
                case 6: System.out.println(str + "Saturday"); break;
            }

        }
        System.out.println("______________________________________________________");


        System.out.println("5.29");

        System.out.print("Enter year: ");
        year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        day = input.nextInt();

        String header;
        System.out.println();
        for (int month = 1; month <= 12; month++) {
            header = "";
            switch (month) {
                case 1:
                    header += "January ";
                    break;
                case 2:
                    header += "February ";
                    break;
                case 3:
                    header += "March ";
                    break;
                case 4:
                    header += "April ";
                    break;
                case 5:
                    header += "May ";
                    break;
                case 6:
                    header += "June ";
                    break;
                case 7:
                    header += "July ";
                    break;
                case 8:
                    header += "August ";
                    break;
                case 9:
                    header += "September ";
                    break;
                case 10:
                    header += "October ";
                    break;
                case 11:
                    header += "November ";
                    break;
                case 12:
                    header += "December ";
                    break;
            }
            header += year + "";

            for (int b = 0; b < 23 - (header.length() / 2); b++) {
                System.out.print(" ");
            }

            System.out.println(header + "\n-----------------------------------------------\n " + "Sun    Mon    Tue    Wed    Thu    Fri    Sat");
            day %= 7;
            for (int b = 0; b <= day * 7; b++) {
                System.out.print(" ");
            }
            int lastDay = 0;
            if ( month == 1 || month == 3  || month == 5 || month == 7 ||
                    month == 8 || month == 10 ||month == 12)
                lastDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                lastDay += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    lastDay += 29;
                else
                    lastDay += 28;
            }
            for (int d = 1; d <= lastDay; d++) {
                if (d < 10)
                    System.out.print(" ");

                if (day % 7 == 6)
                    System.out.print(d + "\n ");
                else {
                    System.out.print(d + "     ");
                    if (d == lastDay)
                        System.out.println();
                }
                day++;

            }
        }
        System.out.println("__________________________________________________");


        System.out.println("5.30");

        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        double compoundValue = 0;
        for (int m = 1; m <= months; m++) {
            compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
        }
        System.out.printf("Amount in savings account after " + months + " months: $%.2f\n", compoundValue);

        System.out.println("__________________________________________________");


        System.out.println("5.31");

        System.out.print("Enter the initial deposit amount: ");
        amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        months = input.nextInt();

        System.out.println("Month  CD Value");

        for (int m = 1; m <= months; m++) {
            amount += amount * (percentageYield / 1200);
            System.out.printf("%-7d%.2f\n", m, amount);
        }

        System.out.println("___________________________________________________");


        System.out.println("5.32");

        int lotteryDigit1, lotteryDigit2;
        lotteryDigit1 = (int)(Math.random() * 10);

        do {
            lotteryDigit2 = (int)(Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);

        System.out.print("Enter your lottery pick (two distinct digits): ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 &&
                guessDigit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

        System.out.println("__________________________________________________________");


        System.out.println("5.33");

        System.out.println("The four perfect number less than 10,000:");
        sum = 0;
        for (int i = 1; i < 10000; i++) {
            sum = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0)
                    sum += k;
            }
            if (i == sum)
                System.out.printf("%20d\n", i);
        }
        System.out.println("______________________________________________");


        System.out.println("3.34");

        int computerWins = 0;
        int userWins = 0;

        do {
            int computer = (int)(Math.random() * 3);

            System.out.print("scissor (0), rock(1), paper (2): ");
            int user = input.nextInt();

            System.out.print("The computer is ");
            switch (computer)
            {
                case 0: System.out.print("scissor."); break;
                case 1: System.out.print("rock."); break;
                case 2: System.out.print("paper."); break;
            }

            System.out.print(" You are ");
            switch (user)
            {
                case 0: System.out.print("scissor"); break;
                case 1: System.out.print("rock"); break;
                case 2: System.out.print("paper"); break;
                default : System.out.println("disqualified for entering an invalid number.");
                    System.exit(1);
            }

            if (computer == user)
                System.out.println(" too, It is a draw");
            else
            {
                boolean win = (user == 0 && computer == 2) ||
                        (user == 1 && computer == 0) ||
                        (user == 2 && computer == 1);
                if (win)
                {
                    System.out.println(". You won");
                    computerWins++;
                }
                else
                {
                    System.out.println(". You lose");
                    userWins++;
                }

            }
            System.out.println("Computer wins: " + computerWins + "\nUser wins: " + userWins);
        } while (Math.abs(computerWins - userWins) <= 2);

        System.out.println("_______________________________________________");


        System.out.println("5.35");
        double summation = 0.0;
        for (double i = 1.0; i <= 624.0; i++) {
            summation += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
        }
        System.out.println("Summation: " + summation);

        System.out.println("________________________________________________");


        System.out.println("5.36");

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.nextLine();

        int d10 = 0;

        for (int i = 0; i < 9; i++) {
            d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
        }
        d10 %= 11;

        for (int i = 0; i < 9; i++) {
            System.out.print(isbn.charAt(i));
        }
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);

        System.out.println("________________________________________________________");


        System.out.println("5.37");

        System.out.print("Select a decimial interger: ");
        int decimal = input.nextInt();

        String binary = "";
        for (int i = decimal; i > 0; i /= 2) {
            binary = (i % 2) + binary;
        }

        System.out.println("The binary value of the decimial \"" + decimal + "\" is: " + binary);

        System.out.print("_____________________________________________");


        System.out.println("5.38");

        System.out.print("Enter a decimal integer: ");
        decimal = input.nextInt();

        String octal = "";							// Hold octal value
        for (int i = decimal; i > 0; i /= 8) {
            octal = i % 8 + octal;
        }

        System.out.println("The octal of " + decimal + " is " + octal);

        System.out.println("_______________________________________");


        System.out.println("5.39");

        double commissionSought = 30000;
        double salesAmount = 0;
        double commission = 0;
        balance = 0;

        while (commission <= commissionSought){
            balance = commission = 0;
            salesAmount += 0.01;

            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount > 0)
                commission += balance * 0.08;
        }
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);

        System.out.println("____________________________________________________________");


        System.out.println("5.40");

        int heads = 0;
        int tails = 0;
        int coin;

        System.out.println("Fipping a coin millon times");
        for (int i = 0; i < 1000000; i++){
            coin = (int)(Math.random() * 2);
            if (coin == 0){
                heads++;
            }
            else
                tails++;
        }System.out.println("Heads: " + heads + "\nTails: " + tails);

        System.out.println("_________________________________________________");


        System.out.println("5.41");

        System.out.print("Enter numbers: ");
        int max = input.nextInt();
        int co = 1;
        number = 1;
        while (number > 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
                co = 1;
            }
            if (number == max)
                co++;
        }
        System.out.println("The largest number is " + max);
        System.out.println(
                "The occurrence count of the largest number is " + co);

        System.out.println("________________________________________________");


        System.out.println("5.42");

        commission = 0.0;
        balance = 0.0;
        salesAmount = 0.0;

        System.out.print("Enter the commission sought: ");
        commissionSought = input.nextDouble();

        for (salesAmount = 0.01; commission < commissionSought; salesAmount += 0.01) {
            if (salesAmount >= 10000.01)
                commission += (balance = salesAmount - 10000) * 0.12;
            if (salesAmount >= 5000.01)
                commission += (balance -= balance - 5000) * 0.10;
            if (salesAmount >= 0.01)
                commission += balance * 0.08;
        }
        System.out.printf("Minimum sales to earn $%.0f: $%.0f\n", commissionSought, salesAmount);

        System.out.println("____________________________________________________");


        System.out.println("5.43");

        c = 0;
        for (int number1 = 1; number1 < 7; number1++) {
            for (int number2 = number1 + 1; number2 <= 7; number2++) {
                System.out.println(number1 + " " + number2);
                c++; // Increment count
            }
        }
        System.out.println("The total number of all combinations is " + c);

        System.out.println("_____________________________________________________");


        System.out.println("5.44");

        System.out.print("Enter an integer: ");
        number = input.nextInt();
        String bits = "";
        for (int i = 0; i < 16; i++) {
            bits = (number & 1) + bits;
            number >>= 1;
        }
        System.out.println("The bits are " + bits);

        System.out.println("______________________________________________________");


        System.out.println("5.45");
        double mean;
        double deviation;
        double numbers;
        mean = deviation = 0;

        System.out.print("Enter ten numbers: ");

        for (int i = 1; i <= 10; i++) {
            numbers = input.nextDouble();
            mean += numbers;
            deviation += Math.pow(numbers, 2);
        }
        deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
        mean /= 10;

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);

        System.out.println("______________________________________________________________________");


        System.out.println("5.46");
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        System.out.println("The reversed string is " + reverse);

        System.out.println("______________________________________________________");


        System.out.println("5.47");

        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        isbn = input.nextLine();

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
        }
        else {
            int checksum = 0;
            for (int i = 0; i < isbn.length(); i++) {
                if ((checksum += i % 2) == 0){
                    checksum = 3 * Integer.parseInt(isbn.charAt(i) + "");
                }
                else { checksum = Integer.parseInt(isbn.charAt(i) + "");
            }
            }checksum = 10 - checksum % 10;
            System.out.println("The ISBN-13 number is ");
            if (checksum == 10){
                System.out.println(isbn + 0);
            }else
                System.out.println(isbn + checksum);
        }


        System.out.println("____________________________________________________");


        System.out.println("5.48");

        System.out.print("Enter a string: ");
        string = input.nextLine();

        String oddPositions = "";

        for (int i = 0; i < string.length(); i+=2) {
            oddPositions += string.charAt(i);
        }

        System.out.println(oddPositions);

        System.out.println("______________________________________");


        System.out.println("5.49");

        System.out.print("Enter a string: ");
        string = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (Character.toUpperCase(string.charAt(i)) == 'A' ||
                        Character.toUpperCase(string.charAt(i)) == 'E' ||
                        Character.toUpperCase(string.charAt(i)) == 'I' ||
                        Character.toUpperCase(string.charAt(i)) == 'O' ||
                        Character.toUpperCase(string.charAt(i)) == 'U') {
                    vowels++;
                } else
                    consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);

        System.out.println("___________________________________________________");


        System.out.println("5.50");

        System.out.print("Enter a string: ");
        string = input.nextLine();

        c = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i)))
                c++;
        }
        System.out.println("Tne number of uppercase letters is " + c);

        System.out.println("____________________________________________________");


        System.out.println("5.51");

        System.out.print("Enter the first string: ");
        String string1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = input.nextLine();

        index = 0;
        String prefix = "";

        while (string1.charAt(index) == string2.charAt(index)) {
            prefix += string1.charAt(index);
            index++;
        }
        if (prefix.length() > 0)
            System.out.println("The commmon prefix is " + prefix);
        else
            System.out.println(string1 + " and " + string2 + " have no commmon prefix");
    }
}

