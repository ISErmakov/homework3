package animal.classes.herbivore;

import animal.classes.Herbivore;
import controller.Animal;
import controller.EatPercent;
import controller.Location;

import java.util.Iterator;
import java.util.Random;

public class Duck extends Herbivore {
    public Duck() {
        super(new Location());
    }

    //Утка,
    @Override
    public String toString(){
        return "\uD83E\uDD86";
    }

    @Override
    public boolean eat(){
        super.eat();

        boolean flag = false;
        Random random = new Random();
        Iterator<Animal> i = location.animalInLoc.iterator();

        while (i.hasNext()){
            Animal a = i.next();
            String key = this.getClass().getSimpleName()+"-"+a.getClass().getSimpleName();
            if (random.nextInt(101) < EatPercent.CONSTANT_MAP.get(key)){
                i.remove();
                a.location.animalInLoc.remove(a);
                a.setDead(true);
                flag = true;
            }
        }
        return flag;
    }
}
