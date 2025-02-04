package animal.classes.predators;

import animal.classes.Predator;
import controller.Location;

public class Boa extends Predator {
    public Boa() {
        super(new Location());
    }

    //Удав,
    @Override
    public String toString(){
        return "\uD83D\uDC0D";
    }
}
