import java.io.*;
import java.util.*;

public class Main{
    
    
public static void subarray( int[] arr){
    
    int n = arr.length;
    for( int i = 0 ; i<n ; i++){
        for(int j = i; j<n; j++){
            for(int k = i; k<= j; k++){
                System.out.print(arr[k]+ "\t");
            }
            System.out.println();
        }
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i<n ; i++){
        arr[i] = scn.nextInt();
        
    }
    subarray(arr);
 }

}