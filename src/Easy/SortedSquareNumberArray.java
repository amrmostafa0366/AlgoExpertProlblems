package Easy;

import java.util.Arrays;

public class SortedSquareNumberArray {

    public static int[] sortedSquaredArray(int[] array) {
        int [] squaredArray = new int[array.length];

        for (int i = 0; i<array.length;i++){
            squaredArray[i] = array[i]*array[i];
        }
        return Arrays.stream(squaredArray).sorted().toArray();
    }

}

