package exc3;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape{
    private double volumeFiled=0;  // поле для хранения заполненности List
    private List<Shape> container; // контейнер для фигур

    Box(double volume){
        container=new ArrayList<>();
        this.volume=volume;
    }

    public double getVolumeFiled() {
        return volumeFiled;
    }

    boolean addShape(Shape shape){
        // Проверяем не превосходит ли объем фигуры изначальный объем контейнера
        if (shape.getVolume()>volume){
            System.out.printf("Размер фигуры %s больше чем контейнер\n",shape);
            return false;
        }
        // Проверяем может ли фигура поместиться в контейнере
        volumeFiled+=shape.getVolume();
        if ((volume-volumeFiled)>=0) {
            container.add(shape);
            return true;
        }else {
            System.out.printf("Фигура %s не поместилась\n",shape);
            volumeFiled-=shape.getVolume();
            return false;
        }

    }
    void printList(){
        System.out.println("Вы добавили в контейнер следующие фигуры:");
        for(Shape l:container){
            System.out.println(l);
        }
    }


}
