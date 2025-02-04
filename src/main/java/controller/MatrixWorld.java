package controller;

import java.util.ArrayList;
import java.util.HashMap;



public class MatrixWorld {


    public static HashMap<Location, ArrayList<Location>> getLocations(int x, int y) {
        return toGraph(getMatrixMap(x,y));
    }

    //функция создания матрицы локация в случае острова прямоугольника
    public static ArrayList<ArrayList<Location>> getMatrixMap(int sizeX, int sizeY)
    {
        ArrayList<ArrayList<Location>> matrixMap= new ArrayList<>();
        //Создаем карту локаций
        for (int i = 0; i < sizeX; i++) {
            ArrayList<Location> line = new ArrayList<>();
            for (int j = 0; j < sizeY; j++) {
                line.add(new Location(i,j));
            }
            matrixMap.add(line);
        }
        return matrixMap;
    }

    // функция преобразования в граф
    public static HashMap<Location, ArrayList<Location>> toGraph(ArrayList<ArrayList<Location>> matrixMap) {
        HashMap<Location, ArrayList<Location>> hashMapGraph = new HashMap<>();
        int sizeX = matrixMap.size();
        int sizeY = matrixMap.get(0).size();

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {

                //HashSetGraph
                Location loc = matrixMap.get(i).get(j);
                ArrayList<Location> locationArrayList = new ArrayList<>();

                if ((i > 0) & (i < sizeX - 1)) {
                    if ((j > 0) & (j < sizeY - 1)) {
                        locationArrayList.add(matrixMap.get(i - 1).get(j - 1));
                        locationArrayList.add(matrixMap.get(i - 1).get(j));
                        locationArrayList.add(matrixMap.get(i - 1).get(j + 1));
                        locationArrayList.add(matrixMap.get(i).get(j - 1));
                        locationArrayList.add(matrixMap.get(i).get(j));
                        locationArrayList.add(matrixMap.get(i).get(j + 1));
                        locationArrayList.add(matrixMap.get(i + 1).get(j - 1));
                        locationArrayList.add(matrixMap.get(i + 1).get(j));
                        locationArrayList.add(matrixMap.get(i + 1).get(j + 1));
                    }
                }

                if ((i == 0) & (j > 0) & (j < sizeY - 1)) {
                    locationArrayList.add(matrixMap.get(i).get(j - 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j + 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j));
                    locationArrayList.add(matrixMap.get(i + 1).get(j + 1));
                }

                if ((i == sizeX - 1) & (j > 0) & (j < sizeY - 1)) {
                    locationArrayList.add(matrixMap.get(i - 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i - 1).get(j));
                    locationArrayList.add(matrixMap.get(i - 1).get(j + 1));
                    locationArrayList.add(matrixMap.get(i).get(j - 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j + 1));
                }

                if ((j == 0) & (i > 0) & (i < sizeX - 1)) {
                    locationArrayList.add(matrixMap.get(i - 1).get(j));
                    locationArrayList.add(matrixMap.get(i - 1).get(j + 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j + 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j));
                    locationArrayList.add(matrixMap.get(i + 1).get(j + 1));
                }

                if ((j == sizeY - 1) & (i > 0) & (i < sizeX - 1)) {
                    locationArrayList.add(matrixMap.get(i - 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i - 1).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j - 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i + 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j));
                }

                if ((i == 0) & (j == 0)) {
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j + 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j));
                    locationArrayList.add(matrixMap.get(i + 1).get(j + 1));
                }

                if ((i == 0) & (j == sizeY - 1)) {
                    locationArrayList.add(matrixMap.get(i).get(j - 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i + 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i + 1).get(j));
                }

                if ((i == sizeX - 1) & (j == 0)) {
                    locationArrayList.add(matrixMap.get(i - 1).get(j));
                    locationArrayList.add(matrixMap.get(i - 1).get(j + 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j + 1));
                }

                if ((i == sizeX - 1) & (j == sizeY - 1)) {
                    locationArrayList.add(matrixMap.get(i - 1).get(j - 1));
                    locationArrayList.add(matrixMap.get(i - 1).get(j));
                    locationArrayList.add(matrixMap.get(i).get(j - 1));
                    locationArrayList.add(matrixMap.get(i).get(j));
                }

                hashMapGraph.put(loc, locationArrayList);
            }

        }
        return hashMapGraph;
    }


}
