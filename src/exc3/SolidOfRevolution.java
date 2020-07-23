package exc3;

public abstract class SolidOfRevolution extends Shape{
     double radius;

    SolidOfRevolution(double volume){
        super(volume);
    }

    SolidOfRevolution(double volume,double radius){
        super(volume);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
}
