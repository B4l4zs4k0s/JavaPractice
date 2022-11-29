public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar( int numberOfStrings) {
        super("Twang", numberOfStrings);
    }
    public ElectricGuitar(){
        super("Twang",6);
    }
    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " + numberOfStrings + " stringed instrument that goes " + name);
    }
}
