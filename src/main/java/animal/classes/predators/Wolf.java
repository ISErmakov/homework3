package animal.classes.predators;

import controller.EatBehavior;
import controller.Predator;

public class Wolf extends Predator implements EatBehavior {

    //Волк,
    @Override
    public String toString(){
        return "\uD83D\uDC3A";
    }

//    @Override
//    public boolean eat(){
//
//        boolean flag = false;
//        Random random = new Random();
//        Iterator<Animal> i = location.animalInLoc.iterator();
//
//        while (i.hasNext()){
//            Animal a = i.next();
//            String key = this.getClass().getSimpleName()+"-"+a.getClass().getSimpleName();
//            if (random.nextInt(101) < EatPercent.CONSTANT_MAP.get(key)){
//                i.remove();
//                a.location.animalInLoc.remove(a);
//                a.setDead(true);
//                flag = true;
//            }
//        }
//        return flag;
//
//    };
}
