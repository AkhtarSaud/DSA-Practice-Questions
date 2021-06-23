import java.util.*;
import java.util.Scanner;

public class Main{
    public static Scanner scn = new Scanner(System.in);
    
    public static Boolean isprime_(int n){
        Boolean prime = true;
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
            
        }
        return prime;
    }
    
    public static void isprime(){
        int n = scn.nextInt();
        Boolean ans = isprime_(n);
        
        if(ans) System.out.println("Prime");
        else System.out.println("not prime");
    }
    public static void printallprime(int a, int b){
        for(int i = a; i <= b; i++){
            Boolean ans = isprime_(i);
            if (ans) System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // write your code here
        int low = scn.nextInt();
        int high = scn.nextInt();
        printallprime(low, high);
    }
}