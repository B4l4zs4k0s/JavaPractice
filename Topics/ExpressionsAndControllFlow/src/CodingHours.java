public class CodingHours {
    public static void main(String[] args) {
        printAverage(6, 17, 5);
        printPercentageOfCodingHours(52, 6, 17, 5);
    }

    private static void printAverage(int avgCodingHours, int weeksLong, int workDaysAWeek) {
        System.out.println("Average attendee codes: " + (avgCodingHours * weeksLong * workDaysAWeek) + " ");
    }

    private static void printPercentageOfCodingHours(float workHoursWeekly, int avgCodingHours, int weeksLong, int workDaysAWeek) {
        System.out.println("Print percentage of coding hours: " + ((workHoursWeekly / (avgCodingHours * weeksLong * workDaysAWeek)) * 100 + "%"));
    }
}
// On average, I code 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52