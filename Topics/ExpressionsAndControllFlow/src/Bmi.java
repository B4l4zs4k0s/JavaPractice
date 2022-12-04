public class Bmi {
    public static void main(String[] args) {
        printBMI(returnMass(), returnHeight());
    }

    private static double returnMass() {
        double massInKg = 81.2;
        return massInKg;
    }

    private static double returnHeight() {
        double heightInM = 1.78;
        return heightInM;
    }

    private static void printBMI(double mass, double height) {
        System.out.println("Your BMI is: " + mass / (height * height));
    }
}
// Print the Body mass index (BMI) based on these values