package Diagonale_Difference;

import java.io.IOException;
import java.util.List;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int prim_diag_sum = 0;
        int sec_diag_sum = 0;
        int arr_len = arr.size();

        for (int i = 0; i < arr_len; i++) {
            for (int j = 0; j < arr_len; j++) {
                if (i == j) {
                    prim_diag_sum += arr.get(i).get(j);
                }
                if (j == (arr_len - i - 1)) {
                    sec_diag_sum += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(sec_diag_sum - prim_diag_sum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

    }
}

