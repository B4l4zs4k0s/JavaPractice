public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender,
                   String previousOrganization) {

        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public void introduce() {
        System.out.println(
                "Hi, I'm " + name + ", a " + age + " years old " + gender +
                        " from " + previousOrganization + " who skipped " +
                        skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
