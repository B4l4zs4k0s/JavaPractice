public class Reptile extends Animal {


    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        String breeding = "laying eggs.";
        return breeding;
    }
}