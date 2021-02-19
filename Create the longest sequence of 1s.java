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
        String b = in.nextLine();
        int count =0;
        int max=0;
        String temp ="";
        try{
            for (int x=0; x<b.length(); x++){
                if (b.charAt(x)=='0'){
                    temp = b;
                    temp = b.substring(0, x) + '1' + b.substring(x + 1);                 
                    for (int i=0; i<temp.length(); i++){
                        if (temp.charAt(i)=='1' ){
                            count++;
                        }
                        if(temp.charAt(i)=='0' ){
                            if (count>max){
                                max = count;
                            }
                            count = 0;

                        }
                    }
                    if (count>max){
                        max = count;
                    }
                    count = 0;
            }
        }
   
        }catch(Exception e) {
        }
       System.out.println(max);
    }
}