package Plus_Minus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int arr_len = arr.length;
        int pos_count=0;
        int neg_count=0;
        int zero_count=0;

        for (int i = 0; i < arr_len; i++) {
            if (arr[i] > 0){
                pos_count ++;
            }else if (arr[i] < 0){
                neg_count ++;
            }
            else {
                zero_count ++;
            }
        }
        float pos_frac = (float)pos_count/arr_len;
        float neg_frac = (float)neg_count/arr_len;
        float zero_frac = (float)zero_count/arr_len;

        System.out.println(String.format("%.6f",pos_frac));
        System.out.println(String.format("%.6f",neg_frac));
        System.out.println(String.format("%.6f",zero_frac));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

