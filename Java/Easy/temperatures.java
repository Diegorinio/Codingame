package Java.Easy;
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
        int n = in.nextInt(); // the number of temperatures to analyse
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temperatures[i]=t;
        }
        Arrays.sort(temperatures);
        for( int i : temperatures){
            System.err.println(i);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        getClosestToZero(temperatures);
        // System.out.println(temperatures[0]);
    }
    public static void getClosestToZero(int[] data){
        int tmp = 0;
        int h_tmp = 0;
        if(data.length >0){
            tmp = data[0];
            h_tmp = data[data.length-1];
        }
        //tmp low
        for(int x=0;x<data.length;x++){
            if(data[x]>tmp && data[x]<=0){
                tmp=data[x];
            }
            if(data[x]<h_tmp && data[x]>=0){
                h_tmp = data[x];
            }
        }
        if(tmp>h_tmp){
            System.out.println(tmp);
        }
        else if(tmp==0 && h_tmp==0){
            System.out.println(0);
        }
        else{
            System.out.println(h_tmp);
        }
    }
}