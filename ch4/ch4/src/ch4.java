import java.util.Scanner;

public class ch4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("4.1");

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = (2 * r) * Math.sin(Math.PI / 5); // Length of a side
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %5.2f\n", area);

        System.out.println("______________________________________________________");

        System.out.println("4.2");

        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String xy1 = input.nextLine();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String xy2 = input.nextLine();

        int k = xy1.indexOf(',');

        double x1 = Double.parseDouble(xy1.substring(0, k - 1));
        double y1 = Double.parseDouble(xy1.substring(k + 2));
        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0, k - 1));
        double y2 = Double.parseDouble(xy2.substring(k + 2));

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double distance = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between the two points is " + distance);

        System.out.println("____________________________________________________");


        System.out.println("4.3");

        double xAG = Math.toRadians(33.7489954);
        double yAG = Math.toRadians(-84.3879824);
        double xOF = Math.toRadians(28.5383355);
        double yOF = Math.toRadians(-81.37923649999999);
        double xSG = Math.toRadians(32.0835407);
        double ySG = Math.toRadians(-81.09983419999998);
        double xCNC = Math.toRadians(35.2270869);
        double yCNC = Math.toRadians(-80.84312669999997);

        double radius = 6371.01;
        double AG_OF = radius * Math.acos(Math.sin(xAG) * Math.sin(xOF) + Math.cos(xAG) * Math.cos(xOF) * Math.cos(yAG - yOF));
        double SG_OF = radius * Math.acos(Math.sin(xSG) * Math.sin(xOF) + Math.cos(xSG) * Math.cos(xOF) * Math.cos(ySG - yOF));
        double SG_CNC = radius * Math.acos(Math.sin(xSG) * Math.sin(xCNC) + Math.cos(xSG) * Math.cos(xCNC) * Math.cos(ySG - yCNC));
        double AG_CNC = radius * Math.acos(Math.sin(xAG) * Math.sin(xCNC) + Math.cos(xAG) * Math.cos(xCNC) * Math.cos(yAG - yCNC));
        double CNC_OF = radius * Math.acos(Math.sin(xCNC) * Math.sin(xOF) + Math.cos(xCNC) * Math.cos(xOF) * Math.cos(yCNC - yOF));

        System.out.println("AG_OF  = " + AG_OF + " km" );
        System.out.println("SG_OF  = " + SG_OF + " km" );
        System.out.println("SG_CNC = " + SG_CNC + " km" );
        System.out.println("AG_CNC = " + AG_CNC + " km" );
        System.out.println("CNC_OF = " + CNC_OF + " km" );
        System.out.println();

        double s4_3 = (AG_CNC + CNC_OF + AG_OF) / 2;
        double area4_3 = Math.sqrt(s4_3 * (s4_3 - AG_CNC) * (s4_3 - CNC_OF) * (s4_3 - AG_OF));
        System.out.printf("Area1 is " + area4_3 + " km^2");
        System.out.println();
        s4_3 = (SG_CNC + CNC_OF + SG_OF) / 2;
        double area2 =  Math.sqrt(s4_3 * (s4_3 - SG_CNC) * (s4_3 - CNC_OF) * (s4_3 - SG_OF));
        System.out.println("Area2 is " + area2 + " km^2");
        System.out.println();
        area += area2;

        System.out.print("Total is " + area + " km^2");

        System.out.println("____________________________________________");

        System.out.println("4.4");

        System.out.print("Enter the side: ");
        double s4_4 = input.nextDouble();

        double area4_4 = (6 * Math.pow(s4_4, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println("The are of the hexagon is " + area4_4);

        System.out.println("_____________________________________________");

        System.out.println("4.5");

        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area4_5 = (numberOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numberOfSides)));

        System.out.println("The area of the polygon is " + area4_5);


        System.out.println("_____________________________________________");

        System.out.println("4.6");

        final double RADIUS_4_6 = 40;
        double angle1_4_6 = (Math.random() * (2 * Math.PI));
        double angle2_4_6 = (Math.random() * (2 * Math.PI));
        double angle3_4_6 = (Math.random() * (2 * Math.PI));

        double x1_4_6 = RADIUS_4_6 * Math.cos(angle1_4_6);
        double y1_4_6 = RADIUS_4_6 * Math.sin(angle1_4_6);
        double x2_4_6 = RADIUS_4_6 * Math.cos(angle2_4_6);
        double y2_4_6 = RADIUS_4_6 * Math.sin(angle2_4_6);
        double x3_4_6 = RADIUS_4_6 * Math.cos(angle3_4_6);
        double y3_4_6 = RADIUS_4_6 * Math.sin(angle3_4_6);

        double a_4_6 = Math.sqrt(Math.pow((x2_4_6 - x3_4_6), 2) + Math.pow((y2_4_6 - y3_4_6), 2));
        double b_4_6 = Math.sqrt(Math.pow((x1_4_6 - x3_4_6), 2) + Math.pow((y1_4_6 - y3_4_6), 2));
        double c_4_6 = Math.sqrt(Math.pow((x1_4_6 - x2_4_6), 2) + Math.pow((y1_4_6 - y2_4_6), 2));

        double angleA_4_6 = Math.toDegrees(Math.acos((a_4_6 * a_4_6 - b_4_6 * b_4_6 - c_4_6 * c_4_6) / (-2 * b_4_6 * c_4_6)));
        double angleB_4_6 = Math.toDegrees(Math.acos((b_4_6 * b_4_6 - a_4_6 * a_4_6 - c_4_6 * c_4_6) / (-2 * a_4_6 * c_4_6)));
        double angleC_4_6 = Math.toDegrees(Math.acos((c_4_6 * c_4_6 - b_4_6 * b_4_6 - a_4_6 * a_4_6) / (-2 * a_4_6 * b_4_6)));

        System.out.println("The three angles are " + Math.round(angleA_4_6 * 100) / 100.0 + " " + Math.round(angleB_4_6 * 100) / 100.0 + " " + Math.round(angleC_4_6 * 100) / 100.0);

        System.out.println("__________________________________________________");


        System.out.println("4.7");

        System.out.print("Enter the radius of the bounding circle: ");
        double radius4_7 = input.nextDouble();
        input.close();

        System.out.println("The coordinates of five points on the pentagon are...");
        for (int i = 0; i < 5; i++) {

            double x = radius4_7 * Math.sin(2.0 * Math.PI / 5.0 * i);
            double y = radius4_7 * Math.cos(2.0 * Math.PI / 5.0 * i);
            System.out.println(x + " " + y);
        }

        System.out.println("_____________________________________________");

        System.out.println("4.8");

        System.out.println("Enter an ASCII code: ");
        int ascii = input.nextInt();
        char ch = (char)ascii;
        System.out.println("The character for ASCII code " + ascii + " is " + ch);

        System.out.println("_____________________________________________");



        System.out.println("4.9");

        System.out.print("Enter a character: ");
        String Ch = input.next();
        char cha = Ch.charAt(0);
        int chInt = (int)cha;
        System.out.println("The Unicode for the character " + Ch + " is " + chInt);

        System.out.println("______________________________________________");




        System.out.println("4.10");

        String set1 =
                        " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                        " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                        " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                        " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                        "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int day = 0;

        System.out.println("Is your birthday in Set1?");
        System.out.println(set1);
        System.out.print("Enter Y for Yes and N for No: ");
        String s_4_10 = input.nextLine();
        char answer = s_4_10.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day += 1;


        System.out.println("Is your birthday in Set2?");
        System.out.println(set2);
        System.out.print("Enter Y for Yes and N for No: ");
        s_4_10 = input.nextLine();
        answer = s_4_10.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day += 2;

        System.out.println("Is your birthday in Set3?");
        System.out.println(set3);
        System.out.print("Enter Y for Yes and N for No: ");
        s_4_10 = input.nextLine();
        answer = s_4_10.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day += 4;

        System.out.println("Is your birthday in Set4?");
        System.out.println(set4);
        System.out.print("Enter Y for Yes and N for No: ");
        s_4_10 = input.nextLine();
        answer = s_4_10.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day += 8;

        System.out.println("Is your birthday in Set5?");
        System.out.println(set5);
        System.out.print("Enter Y for Yes and N for No: ");
        s_4_10 = input.nextLine();
        answer = s_4_10.charAt(0);

        if (Character.toUpperCase(answer) == 'Y')
            day += 16;

        System.out.println("Your birthday is " + day + "!");

        System.out.println("____________________________________________");


        System.out.println("4.11");

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 0 && decimal <= 9)
            System.out.println("The hex value is " + decimal);
        else if (decimal >= 10 && decimal <= 15)
            System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
        else
            System.out.println(decimal + " is an invalid input");

        System.out.println("_____________________________________________");



        System.out.println("4.12");

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        boolean part2 = false;

        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            part2 = true;
        }
        if (part2) {
            char ChAr = hexString.charAt(0);
            if ((ch >= 'A' && ch <= 'F') || (ChAr >= 0 && ch <= 9)) {
                System.out.print("The binary value is ");
                switch (ChAr) {
                    case 0:
                        System.out.println(0000);
                        break;
                    case 1:
                        System.out.println(0001);
                        break;
                    case 2:
                        System.out.println(0010);
                        break;
                    case 3:
                        System.out.println(0011);
                        break;
                    case 4:
                        System.out.println(0100);
                        break;
                    case 5:
                        System.out.println(0101);
                        break;
                    case 6:
                        System.out.println(0110);
                        break;
                    case 7:
                        System.out.println(0111);
                        break;
                    case 8:
                        System.out.println(1000);
                        break;
                    case 9:
                        System.out.println(1001);
                        break;
                    case 'A':
                        System.out.println(1010);
                        break;
                    case 'B':
                        System.out.println(1011);
                        break;
                    case 'C':
                        System.out.println(1100);
                        break;
                    case 'D':
                        System.out.println(1101);
                        break;
                    case 'E':
                        System.out.println(1110);
                        break;
                    case 'F':
                        System.out.println(1111);
                        break;
                }
            } else
                System.out.println(ch + " is and invalid input");
        }
        System.out.println("___________________________________");


        System.out.println("4.13");


        System.out.print("Enter a letter: ");
        String str = input.nextLine();
        char chStr = str.charAt(0);

        if (Character.isLetter(ch))
        {
            switch(Character.toUpperCase(chStr))
            {
                case 'A':
                case 'E':
                case 'I':
                case '0':
                case 'U': System.out.println(chStr + " is a vowel"); break;
                default : System.out.println(chStr + " is a consonant");
            }
        }
        else
            System.out.println(ch + " is an invalid input");

        System.out.println("4.14");
        System.out.println("Enter a letter grade: ");
        String Str = input.next();
        char StrToChar = Str.charAt(0);
        int grade = 5;
        switch (Character.toUpperCase(StrToChar)){
            case 'A': grade = 4; break;
            case 'B': grade = 3; break;
            case 'C': grade = 2; break;
            case 'D': grade = 1; break;
            case 'F': grade = 0; break;
        }
        if (grade < 5)
            System.out.println("The numeric value for grade " + Character.toUpperCase(StrToChar) + " is " + grade);
        else
            System.out.println(Character.toUpperCase(StrToChar) + " is an invalid grade");

        System.out.println("________________________________________________");


        System.out.println("4.15");
        System.out.print("Enter a letter: ");
        String st = input.next();
        char stToChar = st.charAt(0);
        stToChar = Character.toUpperCase(stToChar);

        if (stToChar >= 'A'){
            System.out.println("The corresponding number is " + 2);
        }
        else if (stToChar >= 'D'){
            System.out.println("The corresponding number is " + 3);
        }
        else if (stToChar >= 'G'){
            System.out.println("The corresponding number is " + 4);
        }
        else if (stToChar >= 'J'){
            System.out.println("The corresponding number is " + 5);
        }
        else if (stToChar >= 'M'){
            System.out.println("The corresponding number is " + 6);
        }
        else if (stToChar >= 'P'){
            System.out.println("The corresponding number is " + 7);
        }
        else if (stToChar >= 'T'){
            System.out.println("The corresponding number is " + 8);
        }
        else if (stToChar >= 'W'){
            System.out.println("The corresponding number is " + 9);
        }
        else {
            System.out.println(stToChar + " is an invalid input");
        }

        System.out.println("_________________________________________________");


        System.out.println("4.16");

        int BigCharch = 65 + (int)(Math.random() * (91 - 65));

        System.out.println((char)(BigCharch));

        System.out.println("__________________________________________________");


        System.out.println("4.17");

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        System.out.print(month + " " + year + " has ");

        if ( month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            System.out.println(31 + " days");
        }
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.println(30 + " days");
        }
        else {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println(29 + "days");
            else
                System.out.println(28 + " days");
        }

        System.out.println("___________________________________________________________");


        System.out.println("2.18");

        System.out.print("Enter two characters: ");
        String Characters = input.nextLine();

        char firstCh = Character.toUpperCase(Characters.charAt(0));
        char secCh = str.charAt(1);
        part2 = true;

        switch(firstCh)
        {
            case 'M': System.out.print("Mathematics "); break;
            case 'C': System.out.print("Computer Science "); break;
            case 'I': System.out.print("Information Technology"); break;
            default : System.out.println("Invalid input");
            part2 = false;
        }
        if (part2) {
            switch (secCh) {
                case '1':
                    System.out.println("Freshman");
                    break;
                case '2':
                    System.out.println("Sophomore");
                    break;
                case '3':
                    System.out.println("Junior");
                    break;
                case '4':
                    System.out.println("Senior");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

        System.out.println("_______________________________________________");


        System.out.println("4.19");

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");

        String ISBN_10 = input.next();
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

        System.out.println("_____________________________________________________");


        System.out.println("4.20");

        System.out.print("Enter a sting: ");
        String string = input.nextLine();
        System.out.println("first character of " + string +  " is " + string.charAt(0) + " and a length - " + string.length());

        System.out.println("_____________________________________________________");


        System.out.println("4.21");

        String socialSecurityNumber = input.nextLine();
        boolean isValid =
                (socialSecurityNumber.length() == 11) &&
                        (Character.isDigit(socialSecurityNumber.charAt(0))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(1))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(2))) &&
                        (socialSecurityNumber.charAt(3) == '-') &&
                        (Character.isDigit(socialSecurityNumber.charAt(4))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(5))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(7))) &&
                        (socialSecurityNumber.charAt(6) == '-') &&
                        (Character.isDigit(socialSecurityNumber.charAt(8))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(9))) &&
                        (Character.isDigit(socialSecurityNumber.charAt(10)));
        if (isValid){
            System.out.println(socialSecurityNumber +  " is a valid social security number");
        }
        else {
            System.out.println(socialSecurityNumber + " is an invalid social security number");
        }

        System.out.println("___________________________________________");


        System.out.println("4.22");

        System.out.print("Enter string s1: ");
        String stringAndSub1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String stringAndSub2 = input.nextLine();

        if (stringAndSub1.contains(stringAndSub2))
            System.out.println(stringAndSub2 + " is a substring of " + stringAndSub1);
        else
            System.out.println(stringAndSub1 + "is not a substring of" + stringAndSub1);

        System.out.println("____________________________________________");


        System.out.println("4.23");

        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double nombersOfHoursInWeek = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        System.out.println("Employee Name: " + name +
                        "\nHours Worked: " + nombersOfHoursInWeek +
                        "\nPay Rate: $" + payRate +
                        "\nGross Pay: $" + payRate * nombersOfHoursInWeek +
                        "\nDeductions:" +
                        "\n \tFederal Withholding (20.0%): $" + (payRate * nombersOfHoursInWeek * federalTax) +
                        "\n \tState Withholding (9.0%): $" + (payRate * nombersOfHoursInWeek * stateTax) +
                        "\n \tTotal Deduction: $" + ((payRate * nombersOfHoursInWeek * federalTax) + payRate * nombersOfHoursInWeek * stateTax) +
                        "\nNet Pay: $" + (payRate * nombersOfHoursInWeek - ((payRate * nombersOfHoursInWeek * federalTax) + payRate * nombersOfHoursInWeek * stateTax)));

        System.out.println("______________________________________________");


        System.out.println("4.24");

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        String temp;
        if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)) {
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
        {
            temp = city1;
            city1 = city3;
            city3 = temp;

        }
        if (city3.compareTo(city2) < 0)
        {
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        System.out.println("The three cities in alphabetical order are "  + city1 + " " + city2 + " " + city3);

        System.out.println("_______________________________________________________");


        System.out.println("4.25");

        int letter1 = 65 + (int)(Math.random() * (90 - 65));
        int letter2 = 65 + (int)(Math.random() * (90 - 65));
        int letter3 = 65 + (int)(Math.random() * (90 - 65));

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        int number4 = (int)(Math.random() * 10);

        System.out.println("" + (char)(letter1) + ((char)(letter2)) + ((char)(letter3)) + number1 + number2 + number3 + number4);

        System.out.println("__________________________________________________________");


        System.out.println("4.26");

        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();

        String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        int numberOfQuarters = cents / 25;
        cents %= 25;
        int numberOfDimes = cents / 10;
        cents %= 10;

        int numberOfNickels = cents / 5;
        cents %= 5;

        System.out.println("Your amount " + amount + " consists of\n "
                        + numberOfOneDollars + " dollars\n "
                        + numberOfQuarters + " quarters\n "
                        + numberOfDimes + " dimes\n "
                        + numberOfNickels + " nickels\n "
                        + cents + " pennies\n "
        );


        System.out.println("_______________________________________________");
        System.out.println("");

    }
}
