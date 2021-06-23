//import java.io;
import java.util.Scanner;

public class gapdiagonal{
    
    public static Scanner scn = new Scanner(System.in);

    public static void gapdiagonal(int[][] arr){
        
        for(int gap = 0; gap< arr[0].length; gap++){
            for(int i =0 , j = gap; i<arr.length && j < arr[0].length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void saddlepoint(int[][] arr){      //SaddlePoint
        
        int n = arr.length;
        int m = arr[0].length;
        
        for(int r = 0; r<n; r++){
            int c = 0;
            int minEle= (int)1e8;
            
            for(int j = 0; j< m; j++){
                if(arr[r][j] < minEle){
                    minEle = arr[r][j];
                    c = j;
                }
            }
            boolean isSaddlePoint = true;
            
            for(int i = 0; i<n; i++){
                if(arr[i][c] > minEle){
                    isSaddlePoint = false;
                    break;
                }
            }
            if(isSaddlePoint){
                System.out.println(minEle);
                return;
            }
            
        }
        System.out.println("Invalid Input");
    }

    public static void SortedSearch(int n, int[][] arr, int d){
        int i=n-1, j=0;
        while(i>=0 && j<arr[0].length){
            if(arr[i][j]==d){
                System.out.println(i+"\n"+j);
                return;
            }else if(arr[i][j]<d){ j++;
                
            }
            else i--;
        }
        System.out.println("Not Found");
    }


    public static void rotation(int[][] arr){
        //transpose
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int c1 = 0, c2 = n- 1;
        while(c1 < c2){
            for(int r = 0; r<n; r++){
                int e1 = arr[r][c1];
                int e2 = arr[r][c2];
                
                arr[r][c1] = e2;
                arr[r][c2] = e1;
            }
            
            c1++;
            c2--;
        }
        
    }
    
    public static void displayrotation(int[][] arr){
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        gapdiagonal(arr);
    }

}