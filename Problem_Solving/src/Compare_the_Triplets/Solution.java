package Compare_the_Triplets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();
        int alice_score=0;
        int bob_score=0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)){
                alice_score +=1;
            }
            else if (a.get(i) < b.get(i)){
                bob_score +=1;
            }
        }
        scores.add(alice_score);
        scores.add(bob_score);

        return scores;

    }

    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);

        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);



        List<Integer> result = compareTriplets(a, b);

        result.forEach(r->{
            System.out.println(r);
        });
    }
}

