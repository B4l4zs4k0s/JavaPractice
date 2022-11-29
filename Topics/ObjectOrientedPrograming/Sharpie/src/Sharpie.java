public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public Sharpie(String color) {
        this.color = color;
    }

    public void use() {
        inkAmount -= 10;
    }
}
