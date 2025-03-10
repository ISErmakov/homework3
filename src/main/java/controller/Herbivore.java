package controller;

public class Herbivore extends Animal implements EatBehavior {

    public Herbivore() {
        super(new Location());
        eatBehavior = this;
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
