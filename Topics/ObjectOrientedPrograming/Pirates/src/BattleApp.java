public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ship1.fillShip();
        ship2.fillShip();

        System.out.println(ship1.listOfPirates.size());
        System.out.println(ship2.listOfPirates.size());

        System.out.println(ship1.shipInfo());
        System.out.println(ship2.shipInfo());

        ship1.battle(ship2);

        System.out.println(ship1.listOfPirates.size());
        System.out.println(ship2.listOfPirates.size());

        System.out.println(ship1.shipInfo());
        System.out.println(ship2.shipInfo());
    }
}
