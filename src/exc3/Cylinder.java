package exc3;

public class Cylinder extends SolidOfRevolution {
    private double height;
    Cylinder(double volume){
        super(volume);
    }
    Cylinder(double volume,double height,double radius){
        super(volume);
        this.height=height;
        this.radius=radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder"+"("+this.volume+")";
    }
}
