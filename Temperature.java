import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
    public static int calculpasNegative(int n){
            for (int j=0;j<n;j--){

             }
             return n;
            }
    public static int calculpasPositive(int n){
            for (int j=0;j<n;j++){

             }
             return n;
        }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if(n ==0){
            System.out.println("0");
        }else{
        int pas ;
         int pasMin =0;
        int pasPos = 5526;
        int pasNeg =-273;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
             if (t<0){
               pas =  calculpasNegative(t);
                if (pas > pasNeg ) {
                 pasNeg = pas;
                }
             }if (t>=0) {
              pas =  calculpasPositive(t);
                if (pas < pasPos ) { 
                 pasPos = pas;
                }
             }
            if(pasPos< pasNeg*-1){
                 pasMin = pasPos;
             }else{
                 pasMin = pasNeg;
             }
             if (pasPos + pasNeg ==0){
                 pasMin =pasPos;
             }
        }
        System.out.println(pasMin);
        }
    }
}