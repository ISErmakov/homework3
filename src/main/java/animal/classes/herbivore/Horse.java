package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Horse extends Herbivore {
    public Horse() {
        super(new Location());
    }

    //Лошадь,
    @Override
    public String toString(){
        return "\uD83D\uDC0E";
    }
}
