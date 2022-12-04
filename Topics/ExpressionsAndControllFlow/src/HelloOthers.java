public class HelloOthers {
    public static void main(String[] args) {
        printGreetings();
    }

    private static void printGreetings() {
        greetPerson("Esther");
        greetPerson("Mary");
        greetPerson("Joe");
    }

    private static void greetPerson(String person) {
        System.out.println("Hello " + person);
    }
}
// Greet 3 of your classmates with this program in three separate lines
// like:
//
// Hello, Esther!
// Hello, Mary!
// Hello, Joe!