import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        for (int i = 0; i < H; i++) {
            String line = "";
            String ROW = in.nextLine();
            for(char c : T.toCharArray()){
                int start = getPos(c)*L;
                int end = (start+L);
                line+=ROW.substring(start,end);
            }
            System.out.println(line);
        }
    }
    
        public static int getPos(char mark){
        String a= "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        char m = Character.toUpperCase(mark);
        int r = 69;
        for(int x=0;x<a.length();x++){
            if(a.charAt(x)==m){
                r = x;
            }
        }
        if(r==69)
            return a.length()-1;
        else
            return r;
    }
}