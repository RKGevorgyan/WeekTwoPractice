package exc5;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Array a = new Array(5);
        int max = a.arrayMax();
        int min = a.arrayMin();
        int avg = a.arrayAvg();
        System.out.println("Array: " + a);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);


    }
}
