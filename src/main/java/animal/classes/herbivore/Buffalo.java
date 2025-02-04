package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Buffalo extends Herbivore {
    public Buffalo() {
        super(new Location());
    }

    //Буйвол,
    @Override
    public String toString(){
        return "\uD83D\uDC03";
    }
}
