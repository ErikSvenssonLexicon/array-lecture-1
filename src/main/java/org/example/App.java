package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        double[][] doubles = new double[5][5];
        doubles[0][0] = 0.1;


        System.out.println(toString(doubles));


        /*
        [
            [0.1, 0, 0, 0 ,0]
            [0, 0, 0, 0 ,0]
            [0, 0, 0, 0 ,0]
            [0, 0, 0, 0 ,0]
            [0, 0, 0, 0 ,0]
        ]
         */

    }



    public static String toString(double[][] doubles){
        StringBuilder stringBuilder = new StringBuilder("[");
        for(int i = 0 ; i<doubles.length ; i++){
            stringBuilder.append("\n[");
            for(int ii = 0; ii<doubles[i].length; ii++){
                stringBuilder.append(doubles[i][ii]);
                if(ii != doubles[i].length-1){
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]\n");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }



}
