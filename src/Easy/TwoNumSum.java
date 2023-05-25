package Easy;

import java.util.*;
public class TwoNumSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i< array.length;i++){
            for(int ii = i+1; ii<array.length;ii++){
                if(array[i] + array[ii] == targetSum){
                    return new int []{array[i],array[ii]};
                }
            }
        }
        return new int[0];
    }
}
