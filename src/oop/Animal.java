package oop;

public class Animal {

    private String name;
    private String sound;
    private int weight;

    public Animal(){
        System.out.println("An animal just got created");
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
      if (weight > 0) {
          this.weight = weight;
      } else {
          System.out.println("You can't have a negative weight");
      }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private void makeNoise(){
        System.out.println(name + " goes " + sound);
    }

}
