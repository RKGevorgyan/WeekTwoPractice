package exc3;

public class Pyramid extends Shape{
    private double s,h;
    Pyramid(double volume){
        super(volume);
    }

    @Override
    public String toString() {
        return "Pyramid"+"("+volume+")";
    }
}
