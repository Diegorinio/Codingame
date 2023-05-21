package Java.Easy;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int tX= initialTx;
        int tY = initialTy;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); 
            if(lightX-tX >0 && tY==lightY){
                System.out.println("E");
                tX++;
            }
            else if(lightX-tX < 0 && tY==lightY){
                System.out.println("W");
                tX--;
            }

            if(lightY-tY > 0 && tX==lightX){
                System.out.println("S");
                tY++;
            }
            else if(lightY-tY <0&& tX==lightX){
                System.out.println("N");
                tY--;
            }
            
            if(tX<lightX && tY<lightY){
                System.out.println("SE");
                tY++;
                tX++;
            }
            else if(tX>lightX && tY<lightY){
                System.out.println("SW");
                tY++;
                tX--;
            }
        }
    }
}