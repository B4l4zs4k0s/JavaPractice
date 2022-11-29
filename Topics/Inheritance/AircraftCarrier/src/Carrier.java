import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> listOfAircrafts = new ArrayList<>();
    int ammoStorage;
    int healthPoints;

    public Carrier(int ammoStorage, int healthPoints) {
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft) {
        listOfAircrafts.add(aircraft);
    }

    public void fill() throws ArithmeticException {
        if (ammoStorage > 0) {
            for (int i = 0; i < listOfAircrafts.size(); i++) {
                if (listOfAircrafts.get(i).isPriority()) {
                    ammoStorage = listOfAircrafts.get(i).refillAmmo(ammoStorage);
                }
            }
        }
        if (ammoStorage > 0) {
            for (int i = 0; i < listOfAircrafts.size(); i++) {
                ammoStorage = listOfAircrafts.get(i).refillAmmo(ammoStorage);
            }
         } else {
            throw new ArithmeticException();
        }
    }


    public void fight(Carrier carrierTarget) {
        for (int i = 0; i < listOfAircrafts.size(); i++) {
            carrierTarget.healthPoints -= listOfAircrafts.get(i).fight();
        }
    }

    public void listOfAircraftsOnCarrier() {
        for (int i = 0; i < listOfAircrafts.size(); i++) {
            System.out.println(listOfAircrafts.get(i).getStatus());
        }
    }

    public void getStatus() {
        int totalDamage = 0;
        if (this.healthPoints > 0) {
            for (int i = 0; i < listOfAircrafts.size(); i++) {
                totalDamage += listOfAircrafts.get(i).getDamage();
            }
            System.out.println("HP: " + healthPoints + ", Aircraft count: " + listOfAircrafts.size()
                    + ", Ammo Storage: " + ammoStorage + ", Total damage: " + totalDamage + "\n" + "Aircrafts: ");
            listOfAircraftsOnCarrier();
        } else {
            System.out.println("It's dead Jim :( ");
        }
    }
}
