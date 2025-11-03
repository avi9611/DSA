class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for(int y = 1971; y < year; y++){
            totalDays += leapYear(y) ? 366 : 365;
        }
        for(int m = 1; m < month; m++){
            if(m == 2 && leapYear(year)) totalDays += 29;
            else totalDays += daysInMonth[m - 1];
        }
        totalDays += (day - 1);
        int dayIndex = (5 + totalDays) % 7;
        return days[dayIndex];
    }
    private boolean leapYear(int year){
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}