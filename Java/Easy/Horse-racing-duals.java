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
        ArrayList<Integer> powers = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            powers.add(pi);
        }
        Collections.sort(powers);
        getSimilar(powers);
    }

    public static void getSimilar(ArrayList<Integer> list){
        int tmp= list.get(0);
        ArrayList<Integer> diff_list = new ArrayList<Integer>();
        //x-(x-1) get array of differences
        for(int x=0;x<list.size();x++){
            if(x>0)
                diff_list.add(list.get(x)-list.get(x-1));
        }
        //sort to lowest - it's mean that they were equal
        Collections.sort(diff_list);
        System.out.println(diff_list.get(0));
    }
}