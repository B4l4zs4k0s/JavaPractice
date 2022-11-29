public class StringedInstrument extends Instrument{

    protected int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public void sound(){

    }

    public void play(){
        sound();
    }
}
