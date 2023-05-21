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
        String framePattern = in.nextLine(); // the ASCII art pattern to use to frame the picture
        int h = in.nextInt(); // the height of the picture
        int w = in.nextInt(); // the width  of the picture
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            String line = in.nextLine(); // the ASCII art picture line by line
            lines[i]=line;
        }
        GenerateFrame(lines, w, framePattern);
    }

    public static void GenerateFrame(String[] lines, int line, String frameMark){
        //calculate size by adding frame (lenth+space)*2 + line
        int size = ((frameMark.length()+1)*2)+line;

        //Generate view with picture with frame+space on both sides
        String mid_line = frameMark;
        String[] borders = Frame(size, frameMark);
        //Generate line before Frame with frameMark+spaces+(inversed)frameMark
        for(int x=0;x<(size-(frameMark.length())*2);x++){
            mid_line+=" ";
        }
        mid_line+=reverse(frameMark);

        //Show frame from up to -1 iamge postiton
        for(int x=0;x<borders.length;x++){
            System.out.println(borders[x]);
        }
        System.out.println(mid_line);
        
        //Show image + frames on both sides
        for(int c=0;c<lines.length;c++){
            System.out.println(frameMark+" "+lines[c]+" "+reverse(frameMark));
        }
        System.out.println(mid_line);
        //Show frame in reverse order from top to bottom
        for(int z=borders.length-1;z>=0;z--){
            System.out.println(borders[z]);
        }

    }
    public static String reverse(String s){
        String S="";
        for(int x=s.length()-1;x>=0;x--){
            S+=s.charAt(x);
        }
        return S;
    }

    public static String[] Frame(int size, String frameMark){
        //New array String with frames
        String[] frames=new String[frameMark.length()];
        //split frame to array to get all characters from border
        char[] frameArr = frameMark.toCharArray();
        //Check if frame have more than 1 character
        if(frameArr.length>1){
            //For in range of every frame character 
            for(int x=0;x<frameMark.length();x++){
                String row="";
                //Generate frame character for length "size"
                for(int z=0;z<size;z++){
                    row+=frameArr[x];
                }
                //Check if x>0 to fix corners of frame
                if(x>0){
                    String prefix="";
                    //If 0 element is equal to x-1
                    if((x-1)==(x-x)){
                        prefix=frameArr[x-x]+""+frameArr[x];
                        String result = prefix+row.substring(prefix.length()-1,((row.length()-1)-prefix.length()))+reverse(prefix);
                        frames[x]=result;
                    }
                    //If 0 element is not x-1
                    else{
                        prefix=frameArr[x-x]+""+frameArr[x-1]+""+frameArr[x];
                        String result = prefix+row.substring(prefix.length()-1,(row.length()-1)-prefix.length())+reverse(prefix);
                        frames[x]=result;
                    }
                }
                //If it's first frame just leave it normal
                else{
                    frames[x]=row;
                }
            }
        }
        //If Frame have only 1 character 
        else{
            for(int x=0;x<frameArr.length;x++){
                String row="";
                for(int z=0;z<size;z++){
                    row+=frameArr[x];
                }
                frames[x]=row;
            }
        }
        return frames;
    }
}