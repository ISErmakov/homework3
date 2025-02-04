package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Caterpillar extends Herbivore {
    public Caterpillar() {
        super(new Location());
    }

    @Override
    public String toString(){
        return "\uD83D\uDC1B";
    }
}
