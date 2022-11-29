public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();
        System.out.println("Station gas amount: " + station.gasAmount);
        System.out.println("Car gas amount: " + car.gasAmount);
        station.refill(car);
        System.out.println("Car gas amount: " + car.gasAmount);
        System.out.println("Station gas amount: " + station.gasAmount);
    }
}
