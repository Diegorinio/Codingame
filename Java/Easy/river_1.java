package Java.Easy;
import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        ArrayList<Long> lake1 = new ArrayList<Long>();
        lake1.add(r1);
        ArrayList<Long> lake2 = new ArrayList<Long>();
        lake2.add(r2);
        long range=100000;
        for(int x=0;x<range;x++){
            lake1.add(getNextElement(lake1.get(x)));
        }
        for(int x=0;x<range;x++){
            lake2.add(getNextElement(lake2.get(x)));
        }
        System.err.println(lake1);
        System.err.println(lake2);
        for(long d : lake1){
                if(lake2.contains(d)){
                    range=d;
                    System.out.println(range);
                    break;
                }
            }
    }
    public static long getNextElement(long n){
        long res=0;
        for(char c : Long.toString(n).toCharArray()){
            res+=Character.getNumericValue(c);
        }
        return n+res;
    }
}