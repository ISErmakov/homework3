package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Deer extends Herbivore {
    public Deer() {
        super(new Location());
    }

    //Олень,
    @Override
    public String toString(){
        return "\uD83E\uDD8C";
    }
}
