package vehicles;

public class KennethsGarage {

    public static void main(String[] args) {
        Garage kennethsGarage = new Garage("Kenneth's Garage");

        Vehicle[] garageVehicles = new Vehicle[4];
        garageVehicles[0] = new Car("Pinto");
        garageVehicles[1] = new Car("El Camino");
        garageVehicles[2] = new Car("Z06");
        garageVehicles[3] = new Motorcycle();
        garageVehicles[3].setName("Ninja");
        kennethsGarage.setVehicles(garageVehicles);
        Vehicle vehicle1 = kennethsGarage.findVehicle("Z06", kennethsGarage.getVehicles());
        System.out.println("I found the " + vehicle1.getName());
        kennethsGarage.retrieveVehicles();
    }
}
