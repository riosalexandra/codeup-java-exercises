package birds;

public class BirdShelter {

    private Bird[] birds;

    public Bird[] getBirds() {
        return birds;
    }

    public void setBirds(Bird[] birds) {
        this.birds = birds;
    }

    public void shelterSounds(){
        for (int i = 0; i < this.getBirds().length; i++){
            birds[i].makeNoise();
        }
    }
}
