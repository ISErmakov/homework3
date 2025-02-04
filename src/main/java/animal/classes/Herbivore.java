package animal.classes;

import controller.Animal;
import controller.Location;

public class Herbivore extends Animal implements CanEat {
    public Herbivore(Location loc) {
        super(loc);
    }

    @Override
    //Травоядные едят траву
    public boolean eat(){
        if (super.location.grass > 0) {
            super.location.grass--;
            return true;
        }
        return false;
    }
}
