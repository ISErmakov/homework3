package controller;

import java.util.ArrayList;

public class Location {
    public int grass;
    public int X;
    public int Y;
    public ArrayList<Animal> animalInLoc;


    //Создание ячейки по заданным координатам
    public Location(){
        this(0,0);
    }


    //TODO сделать рост травы
    public Location(int x, int y) {

        grass = 5;
        this.X = x;
        this.Y = y;
        animalInLoc = new ArrayList<>();
    }

    // В локации выводим первое животное
    @Override
    public String toString(){
        if (!animalInLoc.isEmpty()) {return animalInLoc.get(0).toString();}
        return null;
       // return "("+ X + "," + Y + ")";
    }
}


