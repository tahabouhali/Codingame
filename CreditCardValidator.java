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
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String card = in.nextLine();
            card = card.replaceAll("\\s", "");
            int firstStep = 0;
            int secondStep=0;
            int firstStepSum =0;
            int seceondStepSum =0;
            for (int j = card.length()-2;j>=0;j=j-2){
                firstStep = Character.getNumericValue(card.charAt(j))*2;
                if (firstStep>=10){
                    firstStepSum = (firstStep-9)+firstStepSum;
                }else{
                    firstStepSum =  firstStepSum+firstStep;
                }
            }
            for (int j = card.length()-1;j>=0;j=j-2){
                secondStep = Character.getNumericValue(card.charAt(j));
                seceondStepSum =  seceondStepSum+secondStep;
            }
            if (((firstStepSum+seceondStepSum)%10)==0){                         
               System.out.println("YES"); 
            }else{
               System.out.println("NO"); 
            }
        }
    }
}