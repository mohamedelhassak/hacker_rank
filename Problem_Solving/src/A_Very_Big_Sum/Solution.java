package A_Very_Big_Sum;

import java.io.*;
import java.util.*;


public class Solution {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {

        long sum=0;
        for (int i = 0; i < ar.length; i++) {
            sum +=ar[i];
        }

        return sum;

    }

}
