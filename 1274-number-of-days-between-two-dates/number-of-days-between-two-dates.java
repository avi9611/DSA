class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int days1 = countDays(date1);
        int days2 = countDays(date2);

        return Math.abs(days1 - days2);
    }
    private boolean isLeapYear(int year){
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        return year % 4 == 0;
    }
    private int countDays(String date){
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;

        for(int y = 1971; y < year; y++){
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        for(int m = 1; m < month; m++){
            if(m == 2 && isLeapYear(year)){
                totalDays += 29;
            } else {
                totalDays += daysInMonth[m - 1];
            }
        }
        totalDays += day;
        return totalDays;
    }
}