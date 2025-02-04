package controller;

import animal.classes.CanEat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;


public class Animal implements CanEat {
    public Location location;
    private boolean dead;


    //Животное появляется в конкретной локации
    public Animal(Location loc){
    }


    public void move(HashMap<Location, ArrayList<Location>> hashMapGraph, int steps){
        //Шагают от 0 до maxsteps шагов
        location.animalInLoc.remove(this);
        Random rn = new Random();
        Location dist = location;
        for (int i = 0; i < steps; i++) {
            ArrayList<Location> directions  = hashMapGraph.get(dist);
            dist = directions.get(rn.nextInt(directions.size()));
        }
        location = dist;
        location.animalInLoc.add(this);

    }

    public void multiply(Animal animal){

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
                a.location.animalInLoc.remove(a);
                a.setDead(true);
                flag = true;
            }
        }
        return flag;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
        location = null;
    }
}
