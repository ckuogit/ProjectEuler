package euler;

import java.util.Calendar;

/**
 * Problem 19 - Counting Sundays
 */
public class Problem19 {

    /**
     * Find the day of week of any give date
     *
     * @param year
     * @param month
     * @param date
     * @return
     */
    public int findDayOfWeek(int year, int month, int date) {
        Calendar specificDate = Calendar.getInstance();
        specificDate.set(year, month, date);

        return specificDate.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * Problem 19
     * You are given the following information, but you may prefer to do some research for yourself.
     *
     * 1 Jan 1900 was a Monday.
     * Thirty days has September,
     * April, June and November.
     * All the rest have thirty-one,
     * Saving February alone,
     * Which has twenty-eight, rain or shine.
     * And on leap years, twenty-nine.
     * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
     * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
     *
     * @return
     */
    public int FindFirstSundays() {
        long start = System.currentTimeMillis();

        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();

        startDate.set(1901, 0, 1);
        endDate.set(2001, 0, 1);

        int count = 0;
        while (startDate.compareTo(endDate) < 0) {
            int dayOfWeek = findDayOfWeek(startDate.get(Calendar.YEAR), startDate.get(Calendar.MONTH), startDate.get(Calendar.DATE));
            if (Calendar.SUNDAY == dayOfWeek) {
                ++count;
            }
            startDate.add(Calendar.MONTH, 1);
        }

        long end = System.currentTimeMillis();

        System.out.println("Problem 19");
        System.out.println("\tResult: " + count);
        System.out.println("\tExecution time in milli-second: " + (end - start));

        return count;
    }
}
