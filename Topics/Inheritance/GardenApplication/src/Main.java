public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Tree purpleTree = new Tree("purple tree");
        Tree orangeTree = new Tree("orange tree");
        Flower yellowFlower = new Flower("yellow flower");
        Flower blueFlower = new Flower("blue flower");

        garden.addPlant(purpleTree);
        garden.addPlant(orangeTree);
        garden.addPlant(yellowFlower);
        garden.addPlant(blueFlower);

        garden.waterPlants(40);
        garden.getPlantsWaterNeedsInfo();
        garden.waterPlants(70);
        garden.getPlantsWaterNeedsInfo();
    }
}
