public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            int days = (int) ((minutes / 60) / 24) % 365;
            int years = (int) ((minutes / 60) / 24) / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}
