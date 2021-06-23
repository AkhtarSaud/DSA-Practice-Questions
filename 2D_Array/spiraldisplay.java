import java.io.*;
import java.util.*;

public class spiraldisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        
        int[][] arr = new int[row][col];
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    
        spiral(arr, row, col);
    }
    
    public static void spiral(int[][] arr, int n , int m){
        
        int minr = 0;
        int minc = 0;
        
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        
        int tne = n*m;
        int count = 0;
        
        while(count < tne){
            
            //left
            for(int row = minr, col  = minc; row <= maxr && count < tne; row++){
                System.out.println(arr[row][col]);
                count++;
            }
            minc++;
            
            //bottom
            for(int row = maxr, col  = minc; col <= maxc && count < tne; col++){
                System.out.println(arr[row][col]);
                count++;
            }
            maxr--;
            
            //right
            for(int row = maxr, col  = maxc; row >= minr && count < tne; row--){
                System.out.println(arr[row][col]);
                count++;
            }
            maxc--;
            
            //top
            for(int row = minr, col  = maxc; col >= minc && count < tne; col--){
                System.out.println(arr[row][col]);
                count++;
            }
            minr++;
        }
        
        
    }

}