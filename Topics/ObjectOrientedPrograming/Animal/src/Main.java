public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.hunger);
        System.out.println(animal.hunger);
        animal.drink();
        animal.eat();
        System.out.println(animal.hunger);
        System.out.println(animal.thirst);
        animal.play();
        System.out.println(animal.hunger);
        System.out.println(animal.thirst);

    }
}
