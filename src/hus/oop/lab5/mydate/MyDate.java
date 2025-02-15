package hus.oop.lab5.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday","Wednesday",
            "Thursday", "Friday", "Saturday" };
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    private static final int[] leapYearMonthNumbers    = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static boolean isLeapYear(int year) {
        // Check for divisibility by 4
        if (year % 4 == 0) {
            // Check for divisibility by 100 but not 400 (century years)
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
    public static boolean isValidDate(int year, int month, int day) {
        // Check year validity (positive value)
        if (year <= 0 || year > 9999) {
            return false;
        }

        // Check month validity (1-12)
        if (month < 1 || month > 12) {
            return false;
        }

        // Check day validity based on month and whether it's a leap year
        int maxDays = 31;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month == 2) {
            // Check for leap year
            if (isLeapYear(year)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }

        return day >= 1 && day <= maxDays;
    }
    public static int getDayOfWeek(int year, int month, int day)
    {
//        if (! isValidDate(year, month, day)) {
//            return -1;
//        }

        // 1. Based on the first two digit of the year, get the number from the "century" table.
        int magicCenturyNumber = 6 - 2*((year / 100) % 4);

        // 2. Add to the last two digit of the year.
        int lastTwoDigitsOfYear = year % 100;

        // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
        int magicYearNumber = lastTwoDigitsOfYear / 4;

        // 4. Add to the number obtained from the month table.
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month-1] : nonLeapYearMonthNumbers[month-1];

        // 5. Add to the day.
        int magicDayNumber = day;

        // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
        return (  magicCenturyNumber + lastTwoDigitsOfYear
                + magicYearNumber    + magicMonthNumber + magicDayNumber) % 7;
    }
    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " +
                day + " " +
                MONTHS[month-1] + " " +
                year;
    }
    public MyDate nextDay() {
        day++;
        if (isLeapYear(year)) {
            if (day == 30) {
                day = 1;
                nextMonth();
            }
        } else {
            if (day == 29) {
                day = 1;
                nextMonth();
            }
        }
        return this;
    }
    public MyDate nextMonth() {
        month++;
        if (month == 13) {
            month = 1;
            nextYear();
        }
        return this;
    }
    public MyDate nextYear() {
        year++;
        return this;
    }
    public MyDate previousDay() {
        day--;
        if (day == 0) {
            if (isLeapYear(year) && month == 3) {
                day = 29;
                previousMonth();
            } else {
                day = DAYS_IN_MONTHS[month-1];
                previousMonth();
            }
        }
        return this;
    }
    public MyDate previousMonth() {
        month--;    //error
        if (month == 0) {
            month = 12;
            previousYear();
        }
        return this;
    }
    public MyDate previousYear() {
        year--;
        return this;
    }

}
