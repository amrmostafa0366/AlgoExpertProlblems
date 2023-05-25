package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        ArrayList<Integer []> targetSums = new ArrayList<>();
        Arrays.sort(array);
        for(int i = 0 ; i<array.length;i++){
            for(int j = i+1 ; j<array.length; j++){
                for(int k = j+1; k<array.length;k++){
                    if(array[i]+array[j]+array[k]==targetSum){
                        Integer [] tripleArray =  {array[i],array[j],array[k]};
                        targetSums.add(tripleArray);
                    }
                }
            }
        }
        return targetSums;
    }

}
