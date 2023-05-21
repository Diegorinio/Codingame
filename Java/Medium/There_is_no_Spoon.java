import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis


        // It's awful and need some optimization but it works
        char[][] data = new char[height][width];
        String dat_str="";
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            dat_str+=line;
        }
        int id=0;
        char[] chars = dat_str.toCharArray();
        for(int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                data[row][col]=chars[id];
                id++;
            }
        }
        // Three coordinates: a node, its right neighbor, its bottom neighbor
        for(int row=0;row<height;row++){
            for(int col=0;col<width;col++){
                if(data[row][col]=='0'){
                    int x = row;
                    int y = col;
                    CheckCell(data, x,y,height, width);
                }
            }
        }
    }

    static public void CheckCell(char[][] data, int cellX, int cellY, int rows, int cols){
        String coords=cellY+" "+cellX;
        String right="";
        String bottom="";


        //check right
            for(int l=cellY+1;l<cols;l++){
            if(data[cellX][l]=='0'){
               right = l+" "+cellX+" ";
               break;
            }
        }

        //check bottom
            for(int w=cellX+1;w<rows;w++){
            if(data[w][cellY]=='0'){
                bottom += cellY+" "+w;
                break;
            }
        }
        if(right.length()<1){
            right = "-1 -1";
        }
        if(bottom.length()< 1){
            bottom = "-1 -1";
        }

        System.out.println(coords+" "+right+" "+bottom);
    }

}