package exc1;

public class Exercise {
    private double a,b;

    Exercise(double a, double b){
        this.a=a;
        this.b=b;
    }
    void consolePrint(){
        System.out.printf("Первая переменная: %.2f\nВторая переменная: %.2f\n",a,b);
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
}
