package birds;

public class Cat extends Animal implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("Meeeoooowwww");
    }

    @Override
    public void doCuteThing() {
        System.out.println("Purrrrrrrr");
    }


}
