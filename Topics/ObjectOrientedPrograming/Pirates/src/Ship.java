import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> listOfPirates = new ArrayList<>();
    boolean isBattleReady =  true;

    public void fillShip() {
        listOfPirates.add(new Captain());
        Random random = new Random();
        int size = 112;

        for (int i = 0; i < random.nextInt(size); i++) {
            listOfPirates.add(new Pirate());
        }
    }

    public int howManyIsAlive() {

        int numberOfLiving = 0;

        for (int i = 0; i < listOfPirates.size(); i++) {
            if (listOfPirates.get(i).isAlive) {
                numberOfLiving++;
            }
        }
        return numberOfLiving;
    }

    public String shipInfo() {
        return "Captain consumed this amount of rum: " +
                listOfPirates.get(0).intoxicationLevel +
                ". The number of living pirates on the ship is: " +
                howManyIsAlive();

    }

    public int shipScore() {

        int score = 0;

        for (int i = 0; i < listOfPirates.size(); i++) {
            if (listOfPirates.get(i).isAlive) {
                score++;
            }
            if (listOfPirates.get(i).isCaptain) {
                score += listOfPirates.get(i).intoxicationLevel;
            }
        }
        return score;
    }

    public boolean battle(Ship ship) {

        if (shipScore() > ship.shipScore()) {
            ship.randomDeath();
            party();
            return true;
        } else {
            return false;
        }
    }

    public void randomDeath() {

        Random random = new Random();
        int size = listOfPirates.size();

        for (int i = 1; i < random.nextInt(size); i++) {
            listOfPirates.get(i).isAlive = false;
            listOfPirates.remove(i);
        }
    }

    public void party() {

        Random random = new Random();
        int randomDrink = random.nextInt(10);

        for (int i = 0; i < listOfPirates.size(); i++) {
            listOfPirates.get(i).intoxicationLevel += randomDrink;
        }
    }
}
