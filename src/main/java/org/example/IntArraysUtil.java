package org.example;

public class IntArraysUtil {

    public static String toString(int[] ints){
        StringBuilder result = new StringBuilder("[");
        for(int i = 0 ; i<ints.length; i++){
            result.append(ints[i]);
            if(i != ints.length-1){
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static int[] add(int number, int[] source){
        int[] temp = new int[source.length + 1];
        for(int i=0; i<source.length; i++){
            temp[i] = source[i];
        }
        temp[temp.length-1] = number;
        return temp;
    }



}
