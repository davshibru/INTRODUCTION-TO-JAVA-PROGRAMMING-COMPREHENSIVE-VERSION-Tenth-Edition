import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.1");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
        System.out.println("__________________________________");


        System.out.println("1.2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }
        System.out.println("__________________________________");


        System.out.println("1.3");
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A A    V   V    A A");
        System.out.println("J   J  AAAAA    V V    AAAAA");
        System.out.println(" J J  A     A    V    A     A");
        System.out.println("__________________________________");


        System.out.println("1.4");
        System.out.println("a\t\ta^2\t\ta^3");
        System.out.println(1 + "\t\t" + 1 + "\t\t" + 1);
        System.out.println(2 + "\t\t" + Math.pow(2, 2) + "\t\t" + Math.pow(2, 3));
        System.out.println(3 + "\t\t" + Math.pow(3, 2) + "\t\t" + Math.pow(3, 3));
        System.out.println(4 + "\t\t" + Math.pow(4, 2) + "\t" + Math.pow(4, 3));
        System.out.println("__________________________________");


        System.out.println("1.5");
        System.out.println("(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)");
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        System.out.println("__________________________________");


        System.out.println("1.6");
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        System.out.println("__________________________________");


        System.out.println("1.7");
        System.out.println("4 * (1.0/3 + 1/5 - 1/7 + 1/9 - 1/11");
        System.out.println(4 * (1.0 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
        System.out.println("4 * (1.0/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13");
        System.out.println(4 * (1.0 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));
        System.out.println("__________________________________");


        System.out.println("1.8");
        double radius = 5.5;

        System.out.println("perimeter = " + 2 * radius * Math.PI);
        System.out.println("area = " + radius * radius * Math.PI);
        System.out.println("__________________________________");


        System.out.println("1.9");
        double width = 4.5;
        double height = 7.9;
        System.out.println("area = " + width * height);
        System.out.println("__________________________________");


        System.out.println("1.10");
        int meters = 14 * 1000;
        int seconds = 45 * 60 + 30;
        System.out.println("Speed - " + meters / seconds);
        System.out.println("__________________________________");


        System.out.println("1.11");
        int SecBirth = 7;
        int SecDeath = 13;
        int SecImigrant = 45;

        int minDay = 24 * 60;
        int secDay = minDay * 60;

        int DayBirth = secDay / SecBirth;
        int DayDeath = secDay / SecDeath;
        int DayImigrant = secDay / SecImigrant;

        int year = 365;
        int year5 = year * 5;

        int year5Birth = DayBirth * year5;
        int year5Death = DayDeath * year5;
        int year5Imigrant = DayImigrant * year5;

        int population = 312032486;

        int populationIn5years = population + year5Birth + year5Imigrant - year5Death;
        System.out.println("population in 5 years - " + populationIn5years);

        System.out.println("__________________________________________");


        System.out.println("1.12");

        int miles = 24;
        int timeSec = 6035;
        int milesToMeters = miles * 1609;

        System.out.println("speed - " + milesToMeters / timeSec);

        System.out.println("__________________________________________");


        System.out.println("1.13");

        double a = 34;
        double b = 50.2;
        double c = 2.1;
        double d = 55;
        double e = 44.5;
        double f = 5.9;
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("-----------------------------------");


        System.out.println("ch2");
        System.out.println(" ");


        System.out.println("2.1");
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        System.out.println("___________________________________");


        System.out.println("2.2");

        System.out.print("Enter the radius and length of a cylinder: ");
        double radios = scanner.nextDouble();
        double length = scanner.nextDouble();
        double area = radios * radios * Math.PI;
        System.out.println("The area is " + area);
        double volume = area * length;
        System.out.println("The volume is " + volume);

        System.out.println("____________________________________");


        System.out.println("2.3");

        System.out.print("Enter a value for feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is " + (feet * 0.305) + " meters");

        System.out.println("____________________________________");


        System.out.println("2.4");

        System.out.print("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds is " + (pounds * 0.454) + " kilograms");

        System.out.println("____________________________________");


        System.out.println("2.5");

        System.out.println("Enter the subtotal and a gratuity rate: ");

        double maney = scanner.nextDouble();
        double procent = scanner.nextDouble();

        System.out.println("The gratuity is $" + (maney / 100 * procent) + " and total is $" + (maney + (maney / 100 * procent)));

        System.out.println("_____________________________________");


        System.out.println("2.6");

        System.out.println("Enter a number between 0 and 1000: ");
        int numb = scanner.nextInt();
        int sum = 0;
        if (9 < numb && numb <= 99) {
            int last = numb % 10;
            sum = numb / 10 + last;

            System.out.println("");
        } else if (numb >= 100) {
            int last = numb % 10;
            int secNumb = (numb / 10) % 10;
            sum += numb / 100 + secNumb + last;
        } else {
            sum = numb;
        }
        System.out.println("The sum of the digits is " + sum);

        System.out.println("____________________________________");


        System.out.println("2.7");

        System.out.print("Enter the number of minutes: ");
        long number = scanner.nextLong();
        long cday = ((number / 60) / 24) % 365;
        long cyear = ((number / 60) / 24) / 365;
        System.out.println(number + " minutes is approximately " + cyear + " years and " + cday + " days");

        System.out.println("____________________________________");

        System.out.println("2.8");
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = scanner.nextInt();
        System.out.println("");
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalday = totalHours / 24;
        long currentDay = totalday % 12;
        System.out.println("Current time is " + (currentHour + timeZone) + ":" + currentMinute + ":" + currentSecond);

        System.out.println("___________________________________");

        System.out.println("2.9");
        System.out.print("Enter v0, v1, and t: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();
        System.out.println("The average acceleration is " + ((v1 - v0) / t));

        System.out.println("___________________________________");

        System.out.println("2.10");

        System.out.print("Enter the amount of water in kilograms: ");
        double M = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is  " + Q);

        System.out.println("__________________________________");

        System.out.println("2.11");

        System.out.print("Enter the number of years: ");
        int col = scanner.nextInt();
        int specyear = year * col;

        int yearBirth = DayBirth * specyear;
        int yearDeath = DayDeath * specyear;
        int yearImigrant = DayImigrant * specyear;

        int population2_11 = 312032486;

        int populationInyears = population2_11 + yearBirth + yearImigrant - yearDeath;
        System.out.println("population in " + 5 + " years is " + populationInyears);

        System.out.println("__________________________________________");


        System.out.println("2.12");

        System.out.println("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double acceleration = scanner.nextDouble();
        System.out.println("The minimum runway length for this airplane is " + (Math.pow(speed, 2) / (2 * acceleration)));

        System.out.println("__________________________________________");


        System.out.println("2.13");

        System.out.println("Enter the monthly saving amount: ");
        int saveManey = scanner.nextInt();
        double saveBank = 0;
        for (int i = 0; i < 6; i++) {
            saveBank += saveManey;
            saveBank *= (1 + 0.00417);
        }
        System.out.println("After the sixth month, the account value is $" + saveBank);

        System.out.println("___________________________________________");


        System.out.println("2.14");

        System.out.println("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height in inches: ");
        double heightt = scanner.nextDouble();
        weight = weight * 0.45359237;
        heightt = heightt * 0.0254;
        System.out.println("BMI is " + (weight / Math.pow(heightt, 2)));

        System.out.println("________________________________________");


        System.out.println("2.15");

        System.out.println("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double distans = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("The distance between the two points is " + distans);

        System.out.println("_________________________________________");


        System.out.println("2.16");

        System.out.println("Enter the side: ");
        double side = scanner.nextDouble();
        double areaOfTheHexagon = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + areaOfTheHexagon);

        System.out.println("_________________________________________");


        System.out.println("2.17");

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temper = scanner.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = scanner.nextDouble();
        double tws = 35.74 + 0.6215 * temper - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temper * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " + tws);

        System.out.println("_________________________________________");


        System.out.println("2.18");
        System.out.println("a\t\tb\\t\tpow(a, b)");
        System.out.println("1\t\t2\t\t" + Math.pow(1, 2));
        System.out.println("2\t\t3\t\t" + Math.pow(2, 3));
        System.out.println("3\t\t4\t\t" + Math.pow(3, 4));
        System.out.println("4\t\t5\t\t" + Math.pow(4, 5));
        System.out.println("5\t\t6\t\t" + Math.pow(5, 6));

        System.out.println("________________________________________");


        System.out.println("2.19");

        System.out.println("Enter three points for a triangle: ");
        double x1_2_19 = scanner.nextDouble();
        double y1_2_19 = scanner.nextDouble();
        double x2_2_19 = scanner.nextDouble();
        double y2_2_19 = scanner.nextDouble();
        double x3_2_19 = scanner.nextDouble();
        double y3_2_19 = scanner.nextDouble();

        double area2_19 = (x1_2_19 * (y2_2_19 - y3_2_19) + x2_2_19 * (y3_2_19 - y1_2_19) + x3_2_19 * (y1_2_19 - y2_2_19)) / 2;

        System.out.println("The area of the triangle is " + area2_19);

        System.out.println("________________________________________");


        System.out.println("2.20");

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        double interest = balance * (interestRate / 1200);
        System.out.println("The interest is " + interest);

        System.out.println("____________________________________");


        System.out.println("2.21");

        System.out.println("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = scanner.nextDouble();
        System.out.println("Enter number of years: ");
        double numberOfYears = scanner.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
        System.out.println("Accumulated value is $" + futureInvestmentValue);

        System.out.println("______________________________________");


        System.out.println("2.22");

        System.out.print("Enter an amount in int: for example 11.56 like 1156");


        int remainingAmount = scanner.nextInt();

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + remainingAmount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");



        System.out.println("_____________________________________________");


        System.out.println("2.23");

		System.out.print("Enter the driving distace: ");
		double distace = scanner.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = scanner.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = scanner.nextDouble();

		double costOfDriving = (distace / milesPerGallon) * pricePerGallon;

		System.out.println("The cost of driving is $" + costOfDriving);

        System.out.println("-----------------------------------------------");


    }
}
