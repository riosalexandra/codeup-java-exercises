package birds;

public class Penguin extends Bird {

    @Override
    public void makeNoise() {
        System.out.println(this.getName() + " goes honk honk");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Whoosh whoosh");
    }

    public Penguin(){}

    public Penguin(String name){
        super(name);
    }

    public Penguin(String name, boolean flyingBird){
        super(name, flyingBird);
    }
}
