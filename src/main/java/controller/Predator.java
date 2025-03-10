package controller;

import animal.classes.herbivore.Hog;

import java.util.Iterator;
import java.util.Random;

public class Predator extends Animal implements EatBehavior {

    public Predator() {
        super(new Location());
        eatBehavior = this;
    }



    @Override
    public boolean eat() {

        boolean flag = false;
        Random random = new Random();
        Iterator<Animal> i = location.animalInLoc.iterator();

        while (i.hasNext()){
            Animal a = i.next();
            String key = this.getClass().getSimpleName()+"-"+a.getClass().getSimpleName();
            if (random.nextInt(101) < EatPercent.CONSTANT_MAP.get(key)){
                i.remove();
                System.out.println(this + "("+this.location.X +","+ this.location.Y + ") съел "
                        + a +"(" + a.location.X + a.location.Y + ")");
                a.location.animalInLoc.remove(a);
                a.setDead(true);
                flag = true;
            }
        }
        return flag;
    }
}
