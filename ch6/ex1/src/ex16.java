public class ex16 {
    public static void main(String[] args) {
        // Display the number of days in year 2000 to 2020
        System.out.println("Year     Days in year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "         " + numberOfDaysInAYear(year));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
