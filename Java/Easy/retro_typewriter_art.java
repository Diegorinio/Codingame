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
        String T = in.nextLine();
        String[] recipe = T.split(" ");
        String res= "";
        for(String s : recipe){
            res+=getString(s);
        }
        System.out.println(res);
    }

    public static String getString(String s){
        String mark ="";
        String num="";
        String string="";
        int n=0;
        //check if string contains special characters
        if(s.contains("sp")||s.contains("bS")||s.contains("sQ")||s.contains("nl")){
            //so special mark is length=2 so get rest of string before 2
            mark=s.substring(s.length()-2,s.length());
            num = s.substring(0, s.length()-2);
            //Check which special mark is
            if(mark.equals("sp"))
                mark=" ";
            if(mark.equals("bS"))
                mark="\\";
            if(mark.equals("sQ"))
                mark="'";
            if(mark.equals("nl"))
                mark="\n";
        }
        else if(s.length()>2){
            //check if string is longer than 2 and don't contains special characters
            mark = s.substring(s.length()-1,s.length());
            num = s.substring(0,s.length()-1);
        }
        else{
            //String is smaller or equal to 2 so get first and last character
            mark=s.substring(s.length()-1,s.length());
            num = s.substring(0,s.length()-1);
        }
        //Check if numer is given
        if(!num.equals("")){
            n = Integer.parseInt(num);
            //repeat character n times;
            for(int x=1;x<=n;x++){
                string+=mark;
            }
        }
        else{
            string+=mark;
        }

        return string;
    }
}