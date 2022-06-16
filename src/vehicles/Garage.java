package vehicles;

public class Garage {

   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public Garage(){}

    public Garage(String name) {
        this.name = name;
    }

    public Vehicle findVehicle(String name, Vehicle[] vehicles){
        for (Vehicle vehicle: vehicles){
            if (vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        return new Vehicle(null);
    }

    public void retrieveVehicles(){
        for(Vehicle vehicle: vehicles){
            vehicle.makeNoise();
        }
    }
}
