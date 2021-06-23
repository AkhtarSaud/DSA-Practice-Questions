import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getValueInBase(int n, int b){
        // write code here
        
        int rv = 0;
        int p = 1;
        
        while (n > 0){
            
            int dig = n%b;
            n = n/b;
            
            rv += dig * p;
            p = p * 10;
        } return rv;
    }

    

    public static int getDigitFrequency(int n, int d) {
        // write code here
        
        int rv = 0;
        
        while (n>10){
            int dig = n%10;
            n = n/10;
            
            if(dig == d){
                rv++;
            }
        } return rv;
    }
}