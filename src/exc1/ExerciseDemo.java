package exc1;

public class ExerciseDemo {
    public static void main(String[] args) {
        Exercise exercise = new Exercise(10,20);
        System.out.println(exercise);
        exercise.setA(89);
        exercise.setB(22);
        System.out.println(exercise);
        System.out.printf("Сумма а и b: %.2f\n",exercise.sum());
        System.out.printf("Наибольшее значение: %.2f",exercise.compare());
    }
}
