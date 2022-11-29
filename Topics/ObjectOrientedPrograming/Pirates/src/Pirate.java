import java.util.Random;

public class Pirate {
    String name;
    int intoxicationLevel = 0;
    boolean isAlive = true;
    boolean isCaptain = false;

    public void drinkSomeRum() {
        if (!isAlive) {
            die();
        } else
            intoxicationLevel++;
    }

    public void howsItGoingMate() {
        if (!isAlive) {
            die();
        } else if (intoxicationLevel < 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            intoxicationLevel = 0;
        }
    }

    public void brawl(Pirate pirate) {
        Random random = new Random();
        int luck = random.nextInt(3);
        if (!isAlive) {
            die();
        } else if (luck == 1) {
            die();
        } else if (luck == 2) {
            pirate.die();
        } else {
            die();
            pirate.die();
        }
    }

    public void die() {
        isAlive = false;
        System.out.println("He is dead");
    }
}
