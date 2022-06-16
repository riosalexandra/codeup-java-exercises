package vehicles;

public class Car extends Vehicle{

    public Car(){}

    public Car(String name) {
        super(name);
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("meow");
    }

}
