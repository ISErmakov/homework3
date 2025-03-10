package animal.classes;

import animal.classes.herbivore.*;
import animal.classes.predators.*;
import controller.Animal;
import controller.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class AnimalFabric {
    public static Animal createAnimal(Location someLoc){
        Animal randomAnimal = null;
        Random rn = new Random();
        switch (rn.nextInt(15)){
            case 0: {
                randomAnimal = new Buffalo();
                break;
            }
            case 1: {
                randomAnimal = new Deer();
                break;
            }
            case 2: {
                randomAnimal = new Duck();
                break;
            }
            case 3: {
                randomAnimal = new Goat();
                break;
            }
            case 4: {
                randomAnimal = new Hog();
                break;
            }
            case 5: {
                randomAnimal = new Horse();
                break;
            }
            case 6: {
                randomAnimal = new Mouse();
                break;
            }
            case 7: {
                randomAnimal = new Rabbit();
                break;
            }
            case 8: {
                randomAnimal = new Sheep();
                break;
            }
            case 9: {
                randomAnimal = new Caterpillar();
                break;
            }
            case 10: {
                randomAnimal = new Bear();
                break;
            }
            case 11: {
                randomAnimal = new Boa();
                break;
            }
            case 12: {
                randomAnimal = new Eagle();
                break;
            }
            case 13: {
                randomAnimal = new Fox();
                break;
            }
            case 14: {
                randomAnimal = new Wolf();
                break;
            }
        }
        randomAnimal.location = someLoc;
        randomAnimal.location.animalInLoc.add(randomAnimal);

        return randomAnimal;
    }

    public static Animal createAnimal(HashMap<Location, ArrayList<Location>> locations) {
        Set<Location> locationSet = locations.keySet();
        ArrayList<Location> locationArrayList = new ArrayList<>(locationSet);
        Random random = new Random();
        Location someLoc = locationArrayList.get(random.nextInt(locationArrayList.size()));

        return createAnimal(someLoc);
    }
}
