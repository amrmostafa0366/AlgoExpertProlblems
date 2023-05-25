package Easy;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void main(String [] args){
//00 01 02 03 c
//13 23 33 r
//32 31 30 c
//20 10 r
//11 12 c
//22 21 c
        int[][] array = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        System.out.println(spiralTraverse(array));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int r = 0 , c = 0;
        List<Integer> a = new ArrayList<>();

        // Traverse the top row from left to right
        for (c = 0; c < array[r].length; c++) {
            a.add(array[0][c]);
        }

        c--; // Adjust the column index

        // Traverse the right column from top to bottom
        for (r++; r < array.length; r++) {
            a.add(array[r][c]);
        }

        r--; // Adjust the row index

        // Traverse the bottom row from right to left
        for (c--; c >= 0; c--) {
            a.add(array[r][c]);
        }

        c++; // Adjust the column index

        // Traverse the left column from bottom to top
        for (r--; r > 0; r--) {
            a.add(array[r][c]);
        }


        return a;

    }
}
