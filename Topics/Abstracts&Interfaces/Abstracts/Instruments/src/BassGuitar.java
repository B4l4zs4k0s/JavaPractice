public class BassGuitar extends StringedInstrument{

    public BassGuitar( int numberOfStrings) {
        super("Duum-duum-duum", numberOfStrings);
    }

    public BassGuitar(){
        super("Duum-duum-duum",4);
    }

    @Override
    public void sound() {
        System.out.println("Bass guitar, a " + numberOfStrings + " stringed instrument that goes " + name);
    }

}
