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
        int n = in.nextInt();
        int m = in.nextInt();
        String[][] inputs= new String[n][n]; 
        for (int i = 0; i < n; i++) {
            String inputName = in.next();
            String inputSignal = in.next();
            //Add to 2d array elements inputName and InputSignal and split it with spaces to fit 2d array 
            inputs[i]=(inputName+" "+inputSignal).split(" ");
        }
        for (int i = 0; i < m; i++) {
            String outputName = in.next();
            String type = in.next();
            String inputName1 = in.next();
            String inputName2 = in.next();
            Output(inputs, outputName, type, inputName1, inputName2);
        }

    }
    public static void Output(String[][] inputs, String outName, String operation, String gate1, String gate2){
        String outGate1Content="";
        String outGate2Content="";
        for(int x=0;x<inputs.length;x++){
            if(inputs[x][0].equals(gate1)){
                //Get gate content from X row and 0 colum where input name is set and compare it to find input at this signal
                outGate1Content=inputs[x][1];
            }
            if(inputs[x][0].equals(gate2)){
                //Same thing as before but for signal 2
                outGate2Content=inputs[x][1];
            }
        }
        System.out.println(outName+" "+Operation(operation, outGate1Content, outGate2Content));

    }

    public static String Operation(String operation, String in1, String in2){
        String output="";
        char[] input1=in1.toCharArray();
        char[] input2=in2.toCharArray();
        //Get operation and compare elements in characters array, i know it's awful but idc
        switch(operation){
            case "AND":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='-' && input2[x]=='-'){
                output+="-";
            }
            else{
                output+="_";
            }
            }
            break;
            case "OR":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='_' && input2[x]=='_'){
                output+="_";
            }
            else{
                output+="-";
            }
            }
            break;
            case "XOR":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='_' && input2[x]=='_' || input1[x]=='-'&&input2[x]=='-'){
                output+="_";
            }
            else{
                output+="-";
            }
            }
            break;
            case "NAND":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='-' && input2[x]=='-'){
                output+="_";
            }
            else{
                output+="-";
            }
            }
            break;
            case "NOR":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='_' && input2[x]=='_'){
                output+="-";
            }
            else{
                output+="_";
            }
            }
            break;
            case "NXOR":
            for(int x=0;x<in1.length();x++){
            if(input1[x]=='_' && input2[x]=='_' || input1[x]=='-'&&input2[x]=='-'){
                output+="-";
            }
            else{
                output+="_";
            }
            }
        }
            return output;
    }
}