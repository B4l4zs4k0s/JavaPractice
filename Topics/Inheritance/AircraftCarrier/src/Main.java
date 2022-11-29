public class Main {
    public static void main(String[] args) {


        F16 f16first = new F16();
        F16 f16second = new F16();
        F35 f35first = new F35();
        F35 f35second = new F35();
        Carrier blackBetty = new Carrier(500, 6666);
        Carrier nellyTheElephant = new Carrier(5000, 900);
        blackBetty.add(f16first);
        blackBetty.add(f35first);
        nellyTheElephant.add(f16second);
        nellyTheElephant.add(f35second);

        blackBetty.getStatus();
        nellyTheElephant.getStatus();

        System.out.println("=================");

        blackBetty.fill();
        nellyTheElephant.fill();
        blackBetty.getStatus();
        nellyTheElephant.getStatus();
        System.out.println("================");
        blackBetty.fight(nellyTheElephant);
        nellyTheElephant.fight(blackBetty);

        blackBetty.getStatus();
        nellyTheElephant.getStatus();
    }
}