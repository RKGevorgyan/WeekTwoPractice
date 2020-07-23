package exc2;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector(1,2,3);
        Vector vector1 = new Vector(3,4,5);
        System.out.printf("Длина вектора: %.2f\n",vector.vectorLength());
        System.out.printf("Скалярное произведение: %d\n",vector.scalar(vector1));
        vector.vectorProduct(vector1);
        System.out.printf("Сos угла между векторами: %f\n",vector.vectorCorner(vector1));
        System.out.printf("Сумма векторов: %s\n",vector.vectorConcat(vector1));
        System.out.printf("Разность векторов: %s\n",vector.vectorSubtract(vector1));
        Vector[] vectors = Vector.vectorArray(10);
        for(Vector v:vectors){
            System.out.print(v+";");
        }
    }
}
