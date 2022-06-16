package birds;

public class Duck extends Bird {

    public void makeNoise() {
        System.out.println(this.getName() + " goes quack quack");
    }

    public void setName(String name){
        this.name = name;
    }

}
