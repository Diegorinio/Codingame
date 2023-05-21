import java.util.*;
import java.io.*;
import java.math.*;
//Instead writing light range just replace range with "1" and check "X" places
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int L = in.nextInt();
        String[][] map = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String cell = in.next();
                //Add String to map array
                map[i][j]=cell;
            }
        }
        analyzeMap(map, L);
    }
    public static void analyzeMap(String[][] map, int power){
        for(int x=0;x<map.length;x++){
            for(int j=0;j<map[x].length;j++){
                //Find element where is C
                if(map[x][j].equals("C")){
                    //Calculate range of left-right and up-down
                    int dy_min=x-(power-1);
                    int dy_max=x+(power-1);
                    int dx_min=j-(power-1);
                    int dx_max=j+(power-1);
                    //If range is outside array size make it to size of array
                    if(dy_min<0)
                        dy_min=0;
                    if(dy_max>map.length-1)
                        dy_max=map.length-1;
                    if(dx_min<0)
                        dx_min=0;
                    if(dx_max>map[0].length-1)
                        dx_max=map[0].length-1; 
                    //Change rows from dy_min to dy_max and every column from dx_min to dx_max
                    for(int r=dy_min;r<=dy_max;r++){
                        for(int c=dx_min;c<=dx_max;c++){
                            if(!map[r][c].equals("C")){
                            map[r][c]="1";
                            }
                        }
                    }
                }

            }
        }
        int amount=0;
        //Check where X as safe spots are
        for(int r=0;r<map.length;r++){
            String str="";
            for(int c=0;c<map[r].length;c++){
                str+=map[r][c];
                if(map[r][c].equals("X")){
                    amount++;
                }
            }
        }
        System.out.println(amount);
    }
}