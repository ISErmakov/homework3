package animal.classes.predators;

import animal.classes.CanEat;
import animal.classes.Predator;
import animal.classes.herbivore.*;
import controller.Animal;
import controller.Location;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Wolf extends Predator implements CanEat {
    public Wolf() {
        super(new Location());
    }





    //Волк,
    @Override
    public String toString(){
        return "\uD83D\uDC3A";
    }

    @Override
    public boolean eat(){
        HashMap<String, Integer> percent = new HashMap<>();
        percent.put("Wolf-Wolf",0);
        percent.put("Wolf-Boa",0);
        percent.put("Wolf-Fox",0);
        percent.put("Wolf-Bear",0);
        percent.put("Wolf-Eagle",0);
        percent.put("Wolf-Horse",10);
        percent.put("Wolf-Deer",15);
        percent.put("Wolf-Rabbit",60);
        percent.put("Wolf-Mouse",80);
        percent.put("Wolf-Goat",60);
        percent.put("Wolf-Sheep",70);
        percent.put("Wolf-Hog",15);
        percent.put("Wolf-Buffalo",10);
        percent.put("Wolf-Duck",40);
        percent.put("Wolf-Caterpillar",0);


        boolean flag = false;
        Random random = new Random();
        Iterator<Animal> i = location.animalInLoc.iterator();

        while (i.hasNext()){
            Animal a = i.next();
            String key = this.getClass().getSimpleName()+"-"+a.getClass().getSimpleName();
            if (random.nextInt(101) < percent.get(key)){
                i.remove();
                a.location.animalInLoc.remove(a);
                a.setDead(true);
                flag = true;
            }
        }
        return flag;
    };
}
