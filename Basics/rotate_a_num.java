import java.util.*;

public class rotate_a_num {
    
    public static int digits(int n){
        
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static int rotate(int n , int r){
        int len = digits(n);
        
        r %= len;
        if(r < 0)  r += len;
        
        int mul = 1;
        int div = 1;
        
        for(int i = 1; i <= len; i++){
            if(i <= r) div *= 10;
            else mul *= 10;
        }
        
        int a = n % div;
        int b = n / div;
        
        return a * mul + b;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int num = scn.nextInt();
        int rot = scn.nextInt();
        
        System.out.println(rotate(num, rot));
    }
}