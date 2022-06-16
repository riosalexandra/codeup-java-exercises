package birds;

public class BirdShelterTest {

    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Goldfinch();
        birds[0].setName("Goldfinch");
        birds[1] = new Duck();
        birds[1].setName("Duck");
        birds[2] = new Penguin();
        birds[2].setName("Penguin");

        BirdShelter healingWings = new BirdShelter();
        healingWings.setBirds(birds);
        healingWings.shelterSounds();
    }

}
