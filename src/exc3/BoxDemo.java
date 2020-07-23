package exc3;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(100);

        box.addShape(new Cylinder(800));
        box.addShape(new Ball(50));
        box.addShape(new Pyramid(50));
        box.addShape(new Cylinder(4));
        box.addShape(new Ball(2));
        box.addShape(new Cylinder(2));

        box.printList();


    }
}
