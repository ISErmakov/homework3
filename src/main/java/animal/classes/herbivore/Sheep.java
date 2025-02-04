package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Sheep extends Herbivore {
    public Sheep() {
        super(new Location());
    }

    //Овца,
    @Override
    public String toString(){
        return "\uD83D\uDC11";
    }
}
