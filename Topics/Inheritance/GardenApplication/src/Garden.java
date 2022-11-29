import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void waterPlants(int water) {
        for (Plant plant : plants) {
            plant.water(water / plants.size());
        }
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void getPlantsWaterNeedsInfo(){
        for (Plant plant : plants){
            plant.needsWater();
        }
    }
}
