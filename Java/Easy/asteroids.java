import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.Point;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Asteroid {
    double x,y, dirX, dirY;

    public Asteroid(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSpeed(int x, int y, int time) {
        dirX = x-this.x;
        dirY = y-this.y;
        dirX = dirX/time;
        dirY = dirY/time;
        this.x = x;
        this.y = y;
    }

    public Point newPos(int time) {
        x += (int)Math.floor(dirX*time);
        y += (int)Math.floor(dirY*time);
        return new Point((int)x,(int)y);
    }
}

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int T1 = in.nextInt();
        int T2 = in.nextInt();
        int T3 = in.nextInt();
        Map<Character, Asteroid> asteroids = new HashMap<>();
        char[][] smap = new char[H][];
        for (int i = 0; i < H; i++) {
            String firstPictureRow = in.next();
            for(int j = 0; j < firstPictureRow.length(); j++) {
                char c = firstPictureRow.charAt(j);
                if(c!='.') {
                    asteroids.put(c, new Asteroid(j, i));
                }
            }
            smap[i] = in.next().toCharArray();
        }
        char[][] ans = new char[H][W];

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                char c = smap[i][j];
                if(c!='.') {
                    asteroids.get(c).setSpeed(j, i, T2-T1);
                }
                ans[i][j] = '.';
            }
        }

        for(Map.Entry<Character, Asteroid> entry : asteroids.entrySet()) {
            Point p = entry.getValue().newPos(T3-T2);
            if(p.x < 0 || p.x >= W || p.y < 0 || p.y >= H) continue;
            if(ans[p.y][p.x] != '.' && ans[p.y][p.x] < entry.getKey()) continue;
            ans[p.y][p.x] = entry.getKey();
        }

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
