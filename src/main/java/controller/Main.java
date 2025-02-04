package controller;

public class Main {
    public static void main(String[] args)
    {

        int moveCount = 100;
        int sizeX = 20;
        int sizeY = 20;
        int animalCount= 400;


        World world = new World(sizeX,sizeY, animalCount);
        System.out.println("Начало симуляции");
        System.out.println(world);
        for (int i = 1; i < moveCount; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Выполняется ход " + i);
            world.makeMove();
            System.out.println(world);
        }


        System.out.println("Конец симуляции");
    }
}