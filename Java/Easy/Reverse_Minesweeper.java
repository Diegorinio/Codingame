//I know it's awful but it works
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
        int w = in.nextInt();
        int h = in.nextInt();
        //Initialize table array
        char[][] table = new char[h][w];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < h; i++) {
            String line = in.nextLine();
            table[i]=line.toCharArray();
        }
        CheckArray(table);
    }

    public static void CheckArray(char[][] tab){
        char[][] table = tab;
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[0].length;j++){
                if(table[i][j]=='x'){
                    //check left
                    if((j-1)>=0){
                        if(table[i][j-1]=='.'){
                        table[i][j-1]='1';
                        }
                        else if(Character.isDigit(table[i][j-1])){
                        int nr = Character.getNumericValue(table[i][j-1]);
                            nr++;
                            table[i][j-1]=(char)(nr+'0');
                        }
                    }
                    //check right
                    if((j+1)<=table[0].length-1){
                        if(table[i][j+1]=='.')
                        {
                        table[i][j+1]='1';
                        }
                        else if(Character.isDigit(table[i][j+1])){
                        int nr=Character.getNumericValue(table[i][j+1]);
                        nr++;
                        table[i][j+1]=(char)(nr+'0');
                        }
                    }
                    //Check up
                    if((i-1)>=0){
                        //left up
                        if((j-1)>=0){
                            if(table[i-1][j-1]=='.'){
                                table[i-1][j-1]='1';
                            }
                            else if(Character.isDigit(table[i-1][j-1])){
                                int nr=Character.getNumericValue(table[i-1][j-1]);
                                nr++;
                                table[i-1][j-1]=(char)(nr+'0');
                            }
                        }
                        //middle
                        if(table[i-1][j]=='.')
                            table[i-1][j]='1';
                        else if(Character.isDigit(table[i-1][j])){
                            int nr = Character.getNumericValue(table[i-1][j]);
                            nr++;
                            table[i-1][j]=(char)(nr+'0');
                        }
                        //right up
                        if((j+1)<=table[0].length-1){
                            if(table[i-1][j+1]=='.')
                                table[i-1][j+1]='1';
                            else if(Character.isDigit(table[i-1][j+1])){
                                int nr = Character.getNumericValue(table[i-1][j+1]);
                                nr++;
                                table[i-1][j+1]=(char)(nr+'0');
                            }
                        }
                    }
                    //bottom
                    if((i+1)<=table.length-1){
                        //left down
                        if((j-1)>=0){
                            if(table[i+1][j-1]=='.')
                                table[i+1][j-1]='1';
                            else if(Character.isDigit(table[i+1][j-1])){
                                int nr = Character.getNumericValue(table[i+1][j-1]);
                                nr++;
                                table[i+1][j-1]=(char)(nr+'0');
                            }

                        }
                        //down mid
                        if(table[i+1][j]=='.')
                            table[i+1][j]='1';
                        else if(Character.isDigit(table[i+1][j])){
                            int nr = Character.getNumericValue(table[i+1][j]);
                            nr++;
                            table[i+1][j]=(char)(nr+'0');
                        }
                        //down right 
                        if((j+1)<=table[0].length-1){
                            if(table[i+1][j+1]=='.')
                                table[i+1][j+1]='1';
                            else if(Character.isDigit(table[i+1][j+1])){
                                int nr = Character.getNumericValue(table[i+1][j+1]);
                                nr++;
                                table[i+1][j+1]=(char)(nr+'0');
                            }

                        }
                    }
                }
            }

        }

        for(int x=0;x<table.length;x++){
            String res="";

            for( int j =0;j<table[0].length;j++){
                if(table[x][j]=='x')
                    table[x][j]='.';
                res+=table[x][j];
            }
            System.out.println(res);
        }
    }
}