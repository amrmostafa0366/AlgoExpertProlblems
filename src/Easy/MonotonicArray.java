package Easy;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i +1]) {
                isDecreasing = false;
            } else if (array[i] > array[i + 1]) {
                isIncreasing = false;
            }
            if (!isIncreasing && !isDecreasing) {
                break;
            }
        }
        return isIncreasing || isDecreasing;

    }

}
