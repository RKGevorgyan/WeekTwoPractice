package exc5;

import java.util.Arrays;

public class Array {
    private int[] array;
    private int max,min,avg;
    Array(int n){
        array=new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100);
        }
    }
    int arrayMax(){
        max=array[0];
        for (int value : array) {
            if (max < value)
                max = value;
        }
        return max;
    }
    int arrayMin(){
        min=array[0];
        for (int value : array){
            if (min>value) min = value;
        }
        return min;
    }
    int arrayAvg(){
        for (int value : array)
            avg+=value;
        return avg/array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);

    }
}
