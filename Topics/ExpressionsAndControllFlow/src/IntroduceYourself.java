public class IntroduceYourself {
    public static void main(String[] args) {
        printDetails("Anonymous", 29, "cyber security");
    }

    private static void printDetails(String name, int age, String hobby) {
        System.out.println(name + "\r\n" + age + "\r\n" + hobby);
    }
}
// Write a program that prints a few details to the terminal window about you
// It should print each detail to a new line:
//  - Your name
//  - Your age
//  - Your height in meters (as a decimal fraction)
//
//  Example output:
//  John Doe
//  31
//  1.87