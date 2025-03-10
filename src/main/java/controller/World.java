package controller;

import animal.classes.AnimalFabric;
import animal.classes.KnownAnimalsSupplier;
import java.util.*;
import java.util.function.Supplier;


//В мире есть список животных и список локаций в виде графа
public class World {
    //список животных
    private final ArrayList<Animal> animals = new ArrayList<>();
    //список локаций в виде связанного графа
    private final HashMap<Location, ArrayList<Location>> locations;

    //Мир прямоугольной формы З.Ы. Возможно создание иного мира любой формы
    private static int sizeX;
    private static int sizeY;

    //Конструктор прямоугольного мира
    public World(int x, int y, int animalsCount){

        //Создаем список локаций в виде графа
        sizeX = x;
        sizeY = y;
        locations = MatrixWorld.getLocations(x,y);


        //Наполняем локации животными
        for (int i = 0; i < animalsCount; i++) {
            //Создаем животных с помощью фабрики
            Animal animal = AnimalFabric.createAnimal(locations);
            animals.add(animal);
        }

    }

    @Override
    public String toString(){
       StringBuilder sb = new StringBuilder();

       String[][] map = new String[sizeX][sizeY];
        ArrayList<Location> locationArrayList = new ArrayList<>(locations.keySet());
        for (Location l : locationArrayList){
            map[l.X][l.Y] = l.toString();
        }

        //Перевод на карту
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (map[i][j] != null)
                    {sb.append(map[i][j]);}
                else {
                    sb.append("O0");
                }
            }
            sb.append('\n');
        }

//Подсчет количества травы
        int grassSum = 0;
        for (Location loc : locationArrayList){
            grassSum += loc.grass;
        }
//
        sb.append("Количество травы: ").append(grassSum).append("\n");
        int aniCoumt = 0;
        for (Animal a: animals){
            if (!a.isDead()) aniCoumt++;
        }
        sb.append("Количество животных ").append(aniCoumt).append("\n");
//
        return sb.toString();
//
}


    //Сделать один ход симуляции
    public void makeMove(){
        //animals.stream().filter(a -> !a.isDead()).forEach();
        ///animals.stream().filter(Animal::isDead).forEach();

        //Травоядные умеют есть траву, хищники пока ничего не умеют
        for (Animal a: animals){
            if (!a.isDead()){
                a.performEat();
            }
        }

        //Животные умеют перемещаться каждый по 4 шага за ход
        for (Animal a: animals){
            if (!a.isDead()){
                a.move(locations, 4);
            }
        }
    }
}
