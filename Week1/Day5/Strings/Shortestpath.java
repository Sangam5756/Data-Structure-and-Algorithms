import java.util.*;

public class Shortestpath{

    public static float shortPath(String str){
        int x =0, y =0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'E'){
                x++;
            }
           else if(dir == 'W'){
                x--;
            }
           else if(dir == 'N'){
                y++;
            }
           else if(dir == 'S'){
                y--;
            }
           
           
            
        }
        int X2 =x*x;
        int Y2 =y*y;
            return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
            String str ="WNEENESENNN";
            System.out.println(shortPath(str));

    }
}