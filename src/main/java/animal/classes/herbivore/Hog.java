package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Hog extends Herbivore {
    public Hog() {
        super(new Location());
    }

    //Кабан,
    @Override
    public String toString(){
        return "\uD83D\uDC17";
    }
}
