package exc1;

public class Exercise {
    private double a,b;

    Exercise(double a, double b){
        this.a=a;
        this.b=b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    double sum(){
        return a+b;
    }
    double compare(){
        return Math.max(a, b);
    }

    @Override
    public String toString() {
        return "a="+a+", " +"b="+b;
    }
}
