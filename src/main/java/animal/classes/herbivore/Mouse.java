package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Mouse extends Herbivore {
    public Mouse() {
        super(new Location());
    }

    //Мышь,
    @Override
    public String toString(){
        return "\uD83D\uDC01";
    }
}
