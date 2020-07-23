package exc3;

public abstract class Shape {
    double volume;
    Shape(){
    }
    Shape(double volume){
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }
}
