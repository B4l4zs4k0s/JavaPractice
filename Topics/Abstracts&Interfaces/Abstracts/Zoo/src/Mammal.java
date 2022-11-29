public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breeding = "pushing miniature versions out.";
        return breeding;
    }
}