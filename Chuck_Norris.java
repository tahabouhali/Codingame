import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(final String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        int ascii = 0;
        StringBuilder binaire = new StringBuilder ("");
        StringBuilder answerBinary  = new StringBuilder ("");
        StringBuilder finalAnswer = new StringBuilder("");
       
          for (int x=0; x<MESSAGE.length(); x++){
            if((MESSAGE.charAt(x) >= 'A' && MESSAGE.charAt(x) <= 'Z') || (MESSAGE.charAt(x) >= 'a' && MESSAGE.charAt(x) <= 'z')){

                 ascii = (int) MESSAGE.charAt(x);
            }
            else{
                 answerBinary.append('0');
                 ascii = (int) MESSAGE.charAt(x);
            }
            answerBinary.append(Integer.toBinaryString(ascii)) ;
        }
        int x = 0;
        try{
        while (x<=answerBinary.length()){
            if ((answerBinary.charAt(x)=='0')){
                finalAnswer.append("00 0");
                while (answerBinary.charAt(x) ==  answerBinary.charAt(x+1)){
                    finalAnswer.append("0");
                    x++;
                }
                finalAnswer.append(' ');
            }
            if ((answerBinary.charAt(x)=='1')){
                finalAnswer.append("0 0");
                while (answerBinary.charAt(x) ==  answerBinary.charAt(x+1) ){
                    finalAnswer.append("0");
                    x++;
                }
                finalAnswer.append(' ');
            }
            x++; 
       
        }
        System.out.println(finalAnswer);
    }
}