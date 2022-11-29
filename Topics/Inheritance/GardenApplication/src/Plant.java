public class Plant {
    String name;
    double waterLevel;
    double waterNeed;
    double absorbRatio;

    public Plant(String name, double waterLevel, double waterNeed, double absorbRatio) {
        this.name = name;
        this.waterLevel = waterLevel;
        this.waterNeed = waterNeed;
        this.absorbRatio = absorbRatio;
    }

    public void needsWater() {
        if (waterLevel < waterNeed) {
            System.out.println("The " + name + " needs water.");
        } else {
            System.out.println("The " + name + " doesn't need water.");
        }
    }

    public void water(double waterAmount) {
        waterLevel += waterAmount * absorbRatio;

    }
}