package animal.classes.predators;

import animal.classes.Predator;
import controller.Location;

public class Fox extends Predator {
    public Fox() {
        super(new Location());
    }

    //Лиса,
    @Override
    public String toString(){
        return "🦊";
    }
}
