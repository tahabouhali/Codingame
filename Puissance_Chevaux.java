import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> ts = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            ts.add(pi);
        }
        Collections.sort(ts);
        int min = 10000000;
        for (int i = 0; i < ts.size()-1; i++) {
            if (ts.get(i+1)-ts.get(i)<min){
            min =ts.get(i+1)-ts.get(i);
            }
        }
        System.out.println(min);
    }
}