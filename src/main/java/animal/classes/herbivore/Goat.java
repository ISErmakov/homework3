package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Goat extends Herbivore {
    public Goat() {
        super(new Location());
    }

    //Коза,
    @Override
    public String toString(){
        return "\uD83D\uDC10";
    }
}
