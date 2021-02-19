import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();
        String LonA =LON.replaceAll(",", ".");
        String LatA =LAT.replaceAll(",", ".");      
        float longA = Float.parseFloat(LonA);
        float latA = Float.parseFloat(LatA);
        
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String defibConverted ="";
        float x ;
        float y ;
        float distance = 1000 ;
        float currentDistance;
        String  bestlocation="" ;
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();  

            defibConverted = DEFIB.replaceAll(",", ".") ;  
            String[] ary = defibConverted.split(";");
            float longB = Float.parseFloat(ary[4]);
            float latB = Float.parseFloat(ary[5]);
            x= (float) ((longA - longB)* Math.cos((latA+latB)/2));
            y = latA-latB ;
            currentDistance = (float) Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)))*6371;
            if (currentDistance<distance){
                distance = currentDistance;
                bestlocation = ary[1];
            }
            
        }
        System.out.println(bestlocation);

    }
}