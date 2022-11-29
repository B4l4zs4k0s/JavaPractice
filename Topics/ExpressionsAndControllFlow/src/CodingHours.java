public class CodingHours {
    public static void main(String[] args) {
        int averageCoding, weeksLong, workDaysAWeek;
        averageCoding = 6;
        weeksLong = 17;
        workDaysAWeek = 5;

        System.out.println("Average attendee codes: " + (averageCoding * weeksLong * workDaysAWeek));
        System.out.println("Print percentage of coding hours: " + ((52f / (averageCoding * weeksLong * workDaysAWeek)) * 100 + "%"));
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