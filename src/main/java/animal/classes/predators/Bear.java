package animal.classes.predators;

import animal.classes.CanEat;
import animal.classes.Predator;
import controller.Location;

public class Bear extends Predator implements CanEat {
    public Bear() {
        super(new Location());
    }

    //Медведь,
    @Override
    public String toString(){
        return "\uD83D\uDC3B";
    }
}
