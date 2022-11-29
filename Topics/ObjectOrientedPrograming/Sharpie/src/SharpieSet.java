import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList<>();

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    public int countUsable(SharpieSet sharpieSet) {
        int usableSharpies = 0;
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount > 0) {
                usableSharpies++;
            }
        }
        return usableSharpies;
    }

    public void removeTrash(SharpieSet sharpieSet) {
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount <= 0) {
                listOfSharpies.remove(i);
            }
        }
    }
}
