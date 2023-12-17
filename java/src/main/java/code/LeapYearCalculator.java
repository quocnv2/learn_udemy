package code;

public class LeapYearCalculator {
    public static int isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                    return year;
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                    return year;
                }
            } else {
                System.out.printf("%d is a leap year", year);
                return year;
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
            return year;
        }
    }

    public static void main(String[] args) {
        isLeapYear(2021);
    }
}
