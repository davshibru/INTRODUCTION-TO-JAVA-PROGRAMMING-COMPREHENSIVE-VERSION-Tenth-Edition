import java.util.Scanner;

public class ch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ch3");

        System.out.println("3.1");


        System.out.print("Enter a, b, c: ");
        double a3_1 = scanner.nextDouble();
        double b3_1 = scanner.nextDouble();
        double c3_1 = scanner.nextDouble();
        double diskrem = Math.pow(b3_1, 2) - 4 * a3_1 * c3_1;
        if (diskrem >= 0) {
            if (diskrem == 0) {
                System.out.println("The equation has one root " + -b3_1 / 2.0 * a3_1);
            } else {
                System.out.println("The equation has two roots " + (-b3_1 + diskrem) / 2.0 * a3_1 + " and " + (-b3_1 - diskrem) / 2 * a3_1);
            }

        } else {
            System.out.println("The equation has no real roots");
        }

        System.out.println("_____________________________________________________");


        System.out.println("3.2");

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (System.currentTimeMillis() / 25 % 10);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = scanner.nextInt();
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));

        System.out.println("____________________________________________");


        System.out.println("3.3");

        System.out.println("Enter a, b, c, d, e, f: ");
        double a3_3 = scanner.nextDouble();
        double b3_3 = scanner.nextDouble();
        double c3_3 = scanner.nextDouble();
        double d3_3 = scanner.nextDouble();
        double e3_3 = scanner.nextDouble();
        double f3_3 = scanner.nextDouble();
        if (a3_3 * d3_3 - b3_3 * c3_3 == 0) {
            double x3_3 = (e3_3 * d3_3 - b3_3 * f3_3) / (a3_3 * d3_3 - b3_3 * c3_3);
            double y3_3 = (a3_3 * f3_3 - e3_3 * c3_3) / (a3_3 * d3_3 - b3_3 * c3_3);
            System.out.println("x is " + x3_3 + " and y is " + y3_3);
        }
        else {
            System.out.println("The equation has no solution");
        }

        System.out.println("_______________________________________");


        System.out.println("3.4");

        int numbe = (int)(Math.random() * 12) + 1;
        if (numbe == 1)
            System.out.println("January");
        if (numbe == 2)
            System.out.println("February ");
        if (numbe == 3)
            System.out.println("March ");
        if (numbe == 4)
            System.out.println("April");
        if (numbe == 5)
            System.out.println("May ");
        if (numbe == 6)
            System.out.println("June");
        if (numbe == 7)
            System.out.println("July ");
        if (numbe == 8)
            System.out.println("August" );
        if (numbe == 9)
            System.out.println("September");
        if (numbe == 10)
            System.out.println("October");
        if (numbe == 11)
            System.out.println("November");
        if (numbe == 12)
            System.out.println("December");

        System.out.println("______________________________________");



        System.out.println("3.5");

        System.out.println("Enter today's day: ");
        int dayOfWeek = scanner.nextInt();
        String dayOfW = "";

        System.out.println("Enter the number of days elapsed since today: ");
        int futerDayOfWeekNumber = scanner.nextInt();
        int futerDayOfWeek = futerDayOfWeekNumber % 7 + dayOfWeek;

        if (dayOfWeek == 1)
            dayOfW = "Monday";
        if (dayOfWeek == 2)
            dayOfW = "Tuesday";
        if (dayOfWeek == 3)
            dayOfW = "Wednesday";
        if (dayOfWeek == 4)
            dayOfW = "Thursday";
        if (dayOfWeek == 5)
            dayOfW =  "Friday";
        if (dayOfWeek == 6)
            dayOfW = "Saturday";
        if (dayOfWeek == 0)
            dayOfW = "Sunday";

        String futerDayW = "";

        if (futerDayOfWeek == 1)
            futerDayW = "Monday";
        if (futerDayOfWeek == 2)
            futerDayW = "Tuesday";
        if (futerDayOfWeek == 3)
            futerDayW = "Wednesday";
        if (futerDayOfWeek == 4)
            futerDayW = "Thursday";
        if (futerDayOfWeek == 5)
            futerDayW =  "Friday";
        if (futerDayOfWeek == 6)
            futerDayW = "Saturday";
        if (futerDayOfWeek == 0)
            futerDayW = "Sunday";

        System.out.println("Today is " + dayOfW + " and the future day is " + futerDayW);


        System.out.println("___________________________________________");

        System.out.println("3.6");

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double FEET_PER_INCH = 0.0833333;


        weight *= KILOGRAMS_PER_POUND;
        double height = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
        double bmi = weight / (Math.pow(height, 2));


        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        System.out.println("____________________________________________");



        System.out.println("3.7");

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = scanner.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int numberOfDollars = remainingAmount / 100;
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfDollars + (numberOfDollars == 1 ? " dollar" : " dollars"));
        System.out.println(" " + numberOfQuarters + (numberOfQuarters == 1 ? " quarter" : " quarters"));
        System.out.println(" " + numberOfDimes + (numberOfDimes == 1 ? " dime" : " dimes"));
        System.out.println(" " + numberOfNickels + (numberOfNickels == 1 ? " nickel" : " nickels"));
        System.out.println(" " + numberOfPennies + (numberOfPennies == 1 ? " pennie" : " pennies"));

        System.out.println("____________________________________________");


        System.out.println("3.8");

        System.out.print("enter three integers ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        int temp = 0;

        if (int1 < int2)
            temp = int2;
        int2 = int1;
        int1 = temp;

        if (int1 < int3)
            temp = int3;
        int3 = int2;
        int2 = int1;
        int1 = temp;

        System.out.println("integers in non-decreasing order - " + int1 + " " + int2 + " " + int3);

        System.out.println("__________________________________________");

        System.out.println("3.9");

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        String ISBN_10 = scanner.next();

        String[] d = new String[9];

        for (int i = 0; i < d.length; i++){
            d[i] = ISBN_10.charAt(i) + "";
        }

        int[] dInt = new int[d.length];

        for (int i = 0; i < dInt.length; i++){
            dInt[i] = Integer.parseInt(d[i]);
        }

        int ISBN_10f = 0;

        for (int i = 1; i <= dInt.length; i++){
            ISBN_10f += dInt[i-1] * i;
        }
        ISBN_10f %= 11;

        String add = "";
        if (ISBN_10f == 10)
            add = "X";
        else
            add += ISBN_10f;

        System.out.println("The ISBN-10 number is " + ISBN_10 + add);

        System.out.println("____________________________________________");


        System.out.println("3.10");

        int number1_3_10 = (int)(Math.random() * 100);
        int number2_3_10 = (int)(Math.random() * 100);

        if (number1_3_10 < number2_3_10) {
            int tempe = number1_3_10;
            number1_3_10 = number2_3_10;
            number2_3_10 = tempe;
        }

        System.out.print ("What is " + number1_3_10 + " - " + number2_3_10 + "? ");

        int answer_3_10 = scanner.nextInt();

        if (number1_3_10 - number2_3_10 == answer_3_10)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1_3_10 + " - " + number2_3_10 + " should be " + (number1_3_10 - number2_3_10));
        }

        System.out.println("__________________________________________");

        System.out.println("3.11");

        System.out.print("to enter the month and yea ");
        int month3_11 = scanner.nextInt();
        int year3_11 = scanner.nextInt();

        boolean feb29 = (year3_11 % 4 == 0 && year3_11 % 100 != 0) || (year3_11 % 400 == 0);
        String monthString = "";
        int colDayOfMonth = 0;

        if (month3_11 == 1) {
            monthString = "January";
            colDayOfMonth = 31;
        }
        if (month3_11 == 2) {
            monthString = "February ";
            colDayOfMonth = 28;
            if (feb29) {
                colDayOfMonth++;
            }
        }
        if (month3_11 == 3) {
            monthString = "March ";
            colDayOfMonth = 31;
        }
        if (month3_11 == 4) {
            monthString = "April";
            colDayOfMonth = 30;
        }
        if (month3_11 == 5) {
            monthString = "May ";
            colDayOfMonth = 31;
        }
        if (month3_11 == 6) {
            monthString = "June";
            colDayOfMonth = 30;
        }
        if (month3_11 == 7) {
            monthString = "July ";
            colDayOfMonth = 31;
        }
        if (month3_11 == 8) {
            monthString = "August";
            colDayOfMonth = 31;
        }
        if (month3_11 == 9) {
            monthString = "September";
            colDayOfMonth = 30;
        }
        if (month3_11 == 10) {
            monthString = "October";
            colDayOfMonth = 31;
        }
        if (month3_11 == 11) {
            monthString = "November";
            colDayOfMonth = 30;
        }
        if (month3_11 == 12) {
            monthString = "December";
            colDayOfMonth = 31;
        }
        System.out.println(monthString + " " + year3_11 + " had " + colDayOfMonth);

        System.out.println("_____________________________________________");



        System.out.println("3.12");

        System.out.println("Enter a three-digit integer: ");
        int pol = scanner.nextInt();
        int first1_3_12 = ("" + pol).charAt(0);
        int first2_3_12 = ("" + pol).charAt(1);
        int first3_3_12 = ("" + pol).charAt(3);
        int antiPol = first3_3_12 + first2_3_12 + first1_3_12;
        boolean polondrom = ("" + pol).equals(antiPol);
        if (polondrom)
            System.out.println(pol + " is a palindrome");
        else
            System.out.println(" is not a palindrome");

        System.out.println("______________________________________________");


        System.out.println("3.13");

        System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), 2-married separately, 3-head of " + "household) Enter the filing status: ");
        int status = scanner.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();

        double tax = 0;
        if (status == 0) { // Compute tax for single filers
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) {
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28 + (income - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28 + (income - 208850) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 2) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 104425) * 0.28;
            else if (income <= 186475)
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 104425) * 0.28 + (income - 186475) * 0.33;
            else
                tax = 8350 * 0.10 + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 104425) * 0.28 + (income - 186475) * 0.33 + (income - 186476) * 0.35;
        }
        else if (status == 3) {
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            else if (income <= 117450)
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25;
            else if (income <= 190200)
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28;
            else if (income <= 372950)
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33 + (income - 372950) * 0.35;

        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        System.out.println("Tax is " + (int)(tax * 100) / 100.0);

        System.out.println("__________________________________________________________");

        System.out.println("3.14");

        int rand = (int)(Math.random() * 2);

        System.out.println("head - 0 or tail - 1");

        int playersRandAnswer = scanner.nextInt();

        if (rand == playersRandAnswer) {
            System.out.println("is correct");
        }
        else {
            System.out.println("incorrect");
        }

        System.out.println("________________________________________");



        System.out.println("3.15");

        int lottery = (int)(Math.random() * 1000);

        System.out.print("Enter your lottery pick (two digits): ");
        int guess = scanner.nextInt();

        int lotteryDigit2 = (lottery / 10) % 10 ;
        int lotteryDigit3 = lottery % 10  ;
        int lotteryDigit1 = ((lottery - lotteryDigit2 * 10) - lotteryDigit3) / 100;

        int guessDigit2 = (guess / 10)% 10 ;
        int guessDigit3 = guess % 10  ;
        int guessDigit1 = ((guess - guessDigit2 * 10) - guessDigit3) / 100;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2 || guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");

        System.out.println("__________________________________________________");


        System.out.println("3.16");

        int widthX = (-50) + (int)(Math.random() * 101);
        int heightY = (-100) + (int)(Math.random() * 201);

        System.out.println("(" + widthX + ", " + heightY + ")");

        System.out.println("___________________________________________________");


        System.out.println("3.17");

        System.out.println("scissor (0), rock (1), paper (2): " );
        int gameScissorRockPaperPlayer = scanner.nextInt();
        System.out.print("The computer is ");
        int gameScissorRockPaperComputer = (int)(Math.random() * 3);

        if (gameScissorRockPaperComputer == 0)
            System.out.print("scissor.");
        else if (gameScissorRockPaperComputer == 1)
            System.out.print("rock.");
        else
            System.out.print("paper.");

        if (gameScissorRockPaperPlayer == 0)
            System.out.print(" You are scissor. ");
        else if (gameScissorRockPaperPlayer == 1)
            System.out.print(" You are rock. ");
        else
            System.out.print(" You are paper. ");

        if (gameScissorRockPaperComputer == 0 && gameScissorRockPaperPlayer == 1 || gameScissorRockPaperComputer == 1 && gameScissorRockPaperPlayer == 2 || gameScissorRockPaperComputer == 2 && gameScissorRockPaperPlayer == 0)
            System.out.println(" You won");
        else if (gameScissorRockPaperComputer == 0 && gameScissorRockPaperPlayer == 0 || gameScissorRockPaperComputer == 1 && gameScissorRockPaperPlayer == 1 || gameScissorRockPaperComputer == 2 && gameScissorRockPaperPlayer == 2)
            System.out.println(" too. It is a draw ");
        else
            System.out.println(" You loses");

        System.out.println("_____________________________________________________________");


        System.out.println("3.18");

        System.out.println("To enter the weight of the package ");
        double weithOfThePackege = scanner.nextDouble();

        if (weithOfThePackege <= 1){
            System.out.println("cost - 3.5");
        }
        else if (weithOfThePackege <= 3){
            System.out.println("cost - 5.5");
        }
        else if (weithOfThePackege <= 10){
            System.out.println("cost - 8.5");
        }
        else if (weithOfThePackege <= 20){
            System.out.println("cost - 10.5");
        }
        else if (weithOfThePackege > 50){
            System.out.println("the package cannot be shipped");
        }

        System.out.println("_________________________________________________");



        System.out.println("3.19");

        System.out.println(" three edges for a triangle ");
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int ca = scanner.nextInt();

        if (ab + bc > ca && bc + ca > ab && ca + ab > bc){
            System.out.println("Pirimetr - " + (ab + bc + ca));
        }
        else {
            System.out.println("the input is invalid");
        }


        System.out.println("____________________________________________");


        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperature = scanner.nextDouble();

        if (temperature > -58 || temperature < 41) {
            System.out.print("Enter the wind speed (>=2) in miles per hour: ");
            double WindSpeed = scanner.nextDouble();

            if (WindSpeed >= 2) {
                double tws = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(WindSpeed, 0.16) + 0.4275 * temperature * Math.pow(WindSpeed, 0.16);
                System.out.println("The wind chill index is " + tws);
            }
            else {
                System.out.println("speed is invalid");
            }
        }else {
            System.out.println("temperature is invalid");
        }


        System.out.println("_________________________________________");


        System.out.println("3.21");

        System.out.print("Enter year: (e.g., 2012): ");
        int year3_21 = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month3_21 = scanner.nextInt();
        if (month3_21 == 1 || month3_21 == 2){
            month3_21 += 12;
            year3_21--;
        }
        System.out.println("Enter the day of the month: ");
        int dayOfTheMonth = scanner.nextInt();
        int j3_21 = year3_21 / 100;
        int k3_21 = year3_21 % 100;
        int h3_21 = (dayOfTheMonth + ((month3_21 + 1) / 10) + k3_21 + (k3_21 / 4) + (j3_21 / 4) + (5 * j3_21)) % 7;
        String DayOfWeek = "";

        if (h3_21 == 2)
            DayOfWeek = "Monday";
        if (h3_21 == 3)
            DayOfWeek = "Tuesday";
        if (h3_21 == 4)
            DayOfWeek = "Wednesday";
        if (h3_21 == 5)
            DayOfWeek = "Thursday";
        if (h3_21 == 6)
            DayOfWeek =  "Friday";
        if (h3_21 == 0)
            DayOfWeek = "Saturday";
        if (h3_21 == 1)
            DayOfWeek = "Sunday";

        System.out.println("Day of the week is " + DayOfWeek);

        System.out.println("______________________________________________________");


        System.out.println("3.22");

        System.out.println("Enter a point with two coordinates: ");
        double x3_22 = scanner.nextDouble();
        double y3_22 = scanner.nextDouble();
        double dist3_22 = Math.sqrt(Math.pow((x3_22 - 0), 2) + Math.pow((y3_22 - 0), 2));
        if (dist3_22 < 5){
            System.out.println("Point (" + x3_22 + ", " + y3_22 + ") is in the circle ");
        }
        else {
            System.out.println("Point (" + x3_22 + ", " + y3_22 + ") is not in the circle");
        }

        System.out.println("___________________________________________________");


        System.out.println("3.23");

        System.out.println("Enter a point with two coordinates: ");
        double x3_23 = scanner.nextDouble();
        double y3_23 = scanner.nextDouble();
        if (x3_23 < 5 && y3_23 < 5){
            System.out.println("Point (" + x3_23 + ", " + y3_23 + ") is in the rectangle");
        }
        else {
            System.out.println("Point (" + x3_23 + ", " + y3_23 + ") is not in the rectangle");
        }

        System.out.println("_________________________________________________");


        System.out.println("3.24");

        int numberOfCards =   (int)(Math.random() * 13);
        int suitOfCards = (int)(Math.random() * 4);

        String[] CardsNumb = new String[13];
        String[] CardsSuit = new String[4];

        CardsNumb[0] = "Ace";
        CardsNumb[1] = "1";
        CardsNumb[2] = "2";
        CardsNumb[3] = "3";
        CardsNumb[4] = "4";
        CardsNumb[5] = "5";
        CardsNumb[6] = "6";
        CardsNumb[7] = "7";
        CardsNumb[8] = "8";
        CardsNumb[9] = "9";
        CardsNumb[10] = "Jack";
        CardsNumb[11] = "Queen";
        CardsNumb[12] = "King";

        CardsSuit[0] = "Clubs";
        CardsSuit[1] = "Diamonds";
        CardsSuit[2] = "Hearts";
        CardsSuit[3] = ", Spades";

        System.out.println("The card you picked is " + CardsNumb[numberOfCards] + " of " + CardsSuit[suitOfCards]);

        System.out.println("____________________________________________________");


        System.out.println("3.25");

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1_3_25 = scanner.nextDouble();
        double y1_3_25 = scanner.nextDouble();
        double x2_3_25 = scanner.nextDouble();
        double y2_3_25 = scanner.nextDouble();
        double x3_3_25 = scanner.nextDouble();
        double y3_3_25 = scanner.nextDouble();
        double x4_3_25 = scanner.nextDouble();
        double y4_3_25 = scanner.nextDouble();

        double a_3_25 = y1_3_25 - y2_3_25;
        double b_3_25 = -1 * (x1_3_25 - x2_3_25);
        double c_3_25 = y3_3_25 - y4_3_25;
        double d_3_25 = -1 * (x3_3_25 - x4_3_25);
        double e_3_25 = (y1_3_25 - y2_3_25) * x1_3_25 - (x1_3_25 - x2_3_25) * y1_3_25;
        double f_3_25 = (y3_3_25 - y4_3_25) * x3_3_25 - (x3_3_25 - x4_3_25) * y3_3_25;

        if (a_3_25 * d_3_25 - b_3_25 * c_3_25 == 0)
        {
            System.out.println("The two lines are parallel");
        }
        else
        {
            double x = (e_3_25 * d_3_25 - b_3_25 * f_3_25) / (a_3_25 * d_3_25 - b_3_25 * c_3_25);
            double y = (a_3_25 * f_3_25 - e_3_25 * c_3_25) / (a_3_25 * d_3_25 - b_3_25 * c_3_25);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }

        System.out.println("_______________________________________________________________________");


        System.out.println("3.26");

        int Int = scanner.nextInt();
        System.out.println("Is " + Int + "  divisible by 5 and 6? " + (Int % 5 == 0 && Int % 6 == 0));
        System.out.println("Is " + Int + "  divisible by 5 or 6? " + (Int % 5 == 0 || Int % 6 == 0));
        System.out.println("Is " + Int + " divisible by 5 or 6, but not both? " + (Int % 5 == 0 && Int % 6 != 0 || Int % 5 != 0 && Int % 6 ==0));


        System.out.println("__________________________________________________________________");


        System.out.println("3.27");

        System.out.println("Enter a point's x- and y-coordinates: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 100;
        double x3 = 200;
        double y3 = 0;
        double a = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
        double b = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
        double c = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
        {
            System.out.println("The point is in the triangle");
        }
        else
        {
            System.out.println("The point is not in the triangle");
        }

        System.out.println("_________________________________________________");


        System.out.println("3.28");

        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1x = scanner.nextDouble();
        double r1y = scanner.nextDouble();
        double r1Width = scanner.nextDouble();
        double r1Height = scanner.nextDouble();

        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = scanner.nextDouble();
        double r2y = scanner.nextDouble();
        double r2Width = scanner.nextDouble();
        double r2Height = scanner.nextDouble();

        if	((Math.sqrt(Math.pow(r2y - r1y, 2)) + r2Height / 2 <= r1Height / 2) &&
                (Math.sqrt(Math.pow(r2x - r1x, 2)) + r2Width / 2 <= r1Width / 2) &&
                (r1Height / 2 + r2Height / 2 <= r1Height) &&
                (r1Width / 2 + r2Width / 2 <= r1Width))
            System.out.println("r2 is inside r1");
        else if ((r1x + r1Width / 2 > r2x - r2Width) ||
                (r1y + r1Height / 2 > r2y - r2Height))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");

        System.out.println("_________________________________________________________");


        System.out.println("3.29");

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");

        double x1_3_29 = scanner.nextDouble();
        double y1_3_29 = scanner.nextDouble();
        double r1_3_29 = scanner.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");

        double x2_3_29 = scanner.nextDouble();
        double y2_3_29 = scanner.nextDouble();
        double r2_3_29 = scanner.nextDouble();

        if (Math.sqrt(Math.pow(x2_3_29 - x1_3_29, 2) + Math.pow(y2_3_29 - y1_3_29, 2))  <= Math.abs(r1_3_29 - r2_3_29))
            System.out.println("circle2 is inside circle1");
        else if (Math.sqrt(Math.pow(x2_3_29 - x1_3_29, 2) + Math.pow(y2_3_29 - y1_3_29, 2)) <= r1_3_29 + r2_3_29)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");

        System.out.println("______________________________________________");


        System.out.println("3.30");

        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = scanner.nextInt();
        long totalMilliseconds_3_30 = System.currentTimeMillis();
        long totalSeconds_3_30 = totalMilliseconds_3_30 / 1000;
        long currentSecond_3_30 = totalSeconds_3_30 % 60;

        long totalMinutes_3_30 = totalSeconds_3_30 / 60;
        long currentMinute_3_30 = totalMinutes_3_30 % 60;
        long totalHours_3_30 = totalMinutes_3_30 / 60;
        long currentHour_3_30 = totalHours_3_30 % 24;
        System.out.println("Current time is " + (currentHour_3_30 + timeZone) + ":" + currentMinute_3_30 + ":" + currentSecond_3_30);

        System.out.println("_________________________________________________________");


        System.out.println("3.31");

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double dollarsToRMB = scanner.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double fromDolToRMBOrRMBtoDol = scanner.nextDouble();
        if (fromDolToRMBOrRMBtoDol > 1){
            System.out.print("Incorrect input");
        }
        else {
            System.out.print("Enter the dollar amount: ");
            double colDollarsOrRMB = scanner.nextDouble();
            if (fromDolToRMBOrRMBtoDol == 0) {
                System.out.print("$" + colDollarsOrRMB + " is " + (colDollarsOrRMB * dollarsToRMB) + " yuan");
            } else {
                System.out.print(colDollarsOrRMB + " yuan is $" + (colDollarsOrRMB / dollarsToRMB));
            }
        }

        System.out.println("_____________________________________________________");


        System.out.println("3.32");

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0_3_32 = scanner.nextDouble();
        double y0_3_32 = scanner.nextDouble();
        double x1_3_32 = scanner.nextDouble();
        double y1_3_32 = scanner.nextDouble();
        double x2_3_32 = scanner.nextDouble();
        double y2_3_32 = scanner.nextDouble();

        double position = (x1_3_32 - x0_3_32) * (y2_3_32 - y0_3_32) - (x2_3_32 - x0_3_32) * (y1_3_32 - y0_3_32);

        System.out.print("(" + x2_3_32 + ", " + y2_3_32 + ") is on the ");

        if (position > 0)
            System.out.print("left side of the ");

        if (position < 0)
            System.out.print("right side of the ");

        System.out.println("line from (" + x0_3_32 + ", " + y0_3_32 + ") to (" + x1_3_32 + ", " + y1_3_32 + ")");

        System.out.println("___________________________________________________");


        System.out.println("3.33");

        System.out.print("Enter weight and price for package 1: ");
        double weight1_3_33 = scanner.nextDouble();
        double price1_3_33 = scanner.nextDouble();
        System.out.print("Enter weight and price for package 2: ");
        double weight2_3_33 = scanner.nextDouble();
        double price2_3_33 = scanner.nextDouble();

        if (price1_3_33 / weight1_3_33 < price2_3_33 / weight2_3_33)
            System.out.println("Package 1 has a better price.");
        else if (price1_3_33 / weight1_3_33 > price2_3_33 / weight2_3_33)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Two packages have the same price.");

        System.out.println("_________________________________________________________");


        System.out.println("3.34");

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0_3_34 = scanner.nextDouble();
        double y0_3_34 = scanner.nextDouble();
        double x1_3_34 = scanner.nextDouble();
        double y1_3_34 = scanner.nextDouble();
        double x2_3_34 = scanner.nextDouble();
        double y2_3_34 = scanner.nextDouble();

        boolean onTheLine = !(((x1_3_34 - x0_3_34) * (y2_3_34 - y0_3_34) - (x2_3_34 - x0_3_34) * (y1_3_34 - y0_3_34)) > 0 || ((x1_3_34 - x0_3_34) * (y2_3_34 - y0_3_34) - (x2_3_34 - x0_3_34) * (y1_3_34 - y0_3_34)) < 0 || (x2_3_34 < x0_3_34) || (y2_3_34 < y0_3_34) || (x2_3_34 > x1_3_34) || (y2_3_34 > y1_3_34));

        System.out.print("(" + x2_3_34 + ", " + y2_3_34 + ") is ");

        if (!onTheLine)
            System.out.print("not ");
        System.out.println("on the line segment from (" + x0_3_34 + ", " + y0_3_34 + ") to (" + x1_3_34 + ", " + y1_3_34 + ")");

        System.out.println("______________________________________________________________________________________________________");

        }
    }
}
