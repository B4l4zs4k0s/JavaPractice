import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SharpieSet sharpieSet = new SharpieSet();

        Sharpie sharpieRed = new Sharpie("red");
        Sharpie sharpieGreen = new Sharpie("green");
        Sharpie sharpieBlue = new Sharpie("green");

        sharpieSet.add(sharpieRed);
        sharpieSet.add(sharpieGreen);
        sharpieSet.add(sharpieBlue);

        System.out.println("Number of usable sharpies are: " + sharpieSet.countUsable(sharpieSet));
        sharpieRed.use();
        System.out.println("the amount of red ink is: " + sharpieRed.inkAmount);
        sharpieGreen.use();

        System.out.println("the amount of green ink is: " + sharpieRed.inkAmount);
        for (int i = 1; i < 10; i++) {
            sharpieGreen.use();
        }
        System.out.println("the amount of green ink is: " + sharpieRed.inkAmount);
        System.out.println("Number of usable sharpies are: " + sharpieSet.countUsable(sharpieSet));

        System.out.println("Size of the sharpie set before removing empty: " + sharpieSet.listOfSharpies.size());
        sharpieSet.removeTrash(sharpieSet);
        System.out.println("Size of the sharpie set after removing empty: " + sharpieSet.listOfSharpies.size());
    }
}
