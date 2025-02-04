package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Location;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super(new Location());
    }

    //Кролик,
    @Override
    public String toString(){
        return "\uD83D\uDC07";
    }
}
