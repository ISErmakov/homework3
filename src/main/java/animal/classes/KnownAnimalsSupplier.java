package animal.classes;

import animal.classes.herbivore.*;
import animal.classes.predators.*;
import controller.Animal;

import java.util.ArrayList;
import java.util.function.Supplier;

final public class KnownAnimalsSupplier {
    //Создаем список с обещанием дать животное с 0 локацией
    public static ArrayList<Supplier<? extends Animal>> getKnownAnimals(){
        ArrayList<Supplier<? extends Animal>> knownAnimals = new ArrayList<>();
        knownAnimals.add(Buffalo::new);
        knownAnimals.add(Deer::new);
        knownAnimals.add(Duck::new);
        knownAnimals.add(Goat::new);
        knownAnimals.add(Hog::new);
        knownAnimals.add(Horse::new);
        knownAnimals.add(Mouse::new);
        knownAnimals.add(Rabbit::new);
        knownAnimals.add(Sheep::new);
        knownAnimals.add(Caterpillar::new);
        knownAnimals.add(Bear::new);
        knownAnimals.add(Boa::new);
        knownAnimals.add(Eagle::new);
        knownAnimals.add(Fox::new);
        knownAnimals.add(Wolf::new);
        return knownAnimals;
    }

}
