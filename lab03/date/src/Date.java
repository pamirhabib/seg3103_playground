public class Date {

    // Data fields
    private int year;
    private int month;
    private int day;

    // String array for displaying month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    // Constructor
    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
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

    // Private methods for setting values and validation
    private void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31.");
        }
        if (isThirtyDayMonth() && day > 30) {
            throw new IllegalArgumentException("Day must be less than or equal to 30 for month " + MONTH_NAMES[month - 1]);
        }
        if (month == 2) {
            if (isLeapYear() && day > 29) {
                throw new IllegalArgumentException("Day must be less than or equal to 29 for February in a leap year.");
            }
            if (!isLeapYear() && day > 28) {
                throw new IllegalArgumentException("Day must be less than or equal to 28 for February in a non-leap year.");
            }
        }
        this.day = day;
    }

    private void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }
        this.month = month;
    }

    private void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year must be greater than or equal to 0.");
        }
        this.year = year;
    }

    // Public methods
    public Date nextDate() {
        int nextYear = year, nextMonth = month, nextDay = day + 1;
        if (isEndOfMonth()) {
            nextDay = 1;
            if (month == 12) {
                nextYear++;
                nextMonth = 1;
            } else {
                nextMonth++;
            }
        }
        return new Date(nextYear, nextMonth, nextDay);
    }

    public boolean isEndOfMonth() {
        if (day == 31 || (day == 30 && isThirtyDayMonth())) {
            return true;
        }
        if (month == 2) {
            if ((isLeapYear() && day == 29) || (!isLeapYear() && day == 28)) {
                return true;
            }
        }
        return false;
    }

    public boolean isThirtyDayMonth() {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    public boolean isLeapYear() {
        if (year % 100 == 0) {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    @Override
    public String toString() {
        return year + "/" + MONTH_NAMES[month - 1] + "/" + day;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Date)) {
            return false;
        }
        Date other = (Date) obj;
        return year == other.getYear() && month == other.getMonth() && day == other.getDay();
    }
}
