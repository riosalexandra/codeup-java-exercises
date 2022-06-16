package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.setName("Chevelle");
        System.out.print(car.getName() + " goes ");
//        car.makeNoise();
        car.breakingDownNoise();

        Helicopter helicopter = new Helicopter();
        helicopter.setName("Helicopter");
        System.out.print(helicopter.getName() + " goes ");
        helicopter.makeNoise();
    }
}
