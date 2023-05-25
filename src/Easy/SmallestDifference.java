package Easy;

import java.util.Arrays;
import java.util.Collections;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int min = Integer.MAX_VALUE;
        int [] array = new int[2];
        for(int i = 0 ; i<arrayOne.length ; i++){
            for(int j = 0; j<arrayTwo.length; j++){
                if(Math.abs(arrayOne[i]- arrayTwo[j])<min){
                    min = Math.abs(arrayOne[i]- arrayTwo[j]);
                    array[0] = arrayOne[i];
                    array[1] = arrayTwo[j];
                }
            }
        }
        return array;
    }
}
