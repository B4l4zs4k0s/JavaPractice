public class Violin extends StringedInstrument{
    public Violin(int numberOfStrings) {
        super("Screech", numberOfStrings);
    }
    public Violin(){
        super("Screech",6);
    }
    @Override
    public void sound() {
        System.out.println("Violin, a " + numberOfStrings + " stringed instrument that goes " + name);
    }
}
