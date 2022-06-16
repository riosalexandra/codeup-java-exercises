package birds;

abstract public class Bird extends Animal {

    // Instance properties
    protected String name;
    private boolean flyingBird;

    // Getters and setters
    public boolean isFlyingBird() {
        return flyingBird;
    }

    public void setFlyingBird(boolean flyingBird) {
        this.flyingBird = flyingBird;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Instance methods
    public void makeNoise(){
        System.out.println(this.getName() + " goes tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

    // Constructors
    public Bird(){
        System.out.println("A bird just got created");
    }

    public Bird(String name){
        this.setName(name);
    }

    public Bird(String name, boolean flyingBird) {
        this.name = name;
        this.flyingBird = flyingBird;
    }
}
