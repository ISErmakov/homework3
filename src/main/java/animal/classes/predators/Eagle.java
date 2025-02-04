package animal.classes.predators;

import animal.classes.Predator;
import controller.Location;

import java.util.Random;

public class Eagle extends Predator {

    public Eagle() {
        super(new Location());
    }

    //Орел
    @Override
    public String toString(){
        return "\uD83E\uDD85";
    }
}
