import java.util.*;
import java.io.*;
import java.math.*;
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // game loop
        while (true) {
                    int max=0;
                    int p=0;
            for (int i = 0; i < 8; i++) { 
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH > max){
                    max = mountainH;
                    p=i;
                }
            }
            System.out.println(p);
        }    
    }
}