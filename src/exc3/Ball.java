package exc3;

public class Ball extends SolidOfRevolution {

    Ball(double volume){
        super(volume);
    }
    Ball(double volume,double radius){
        super(volume,radius);
    }


    @Override
    public String toString() {
        return "Ball"+"("+volume+")";
    }
}
