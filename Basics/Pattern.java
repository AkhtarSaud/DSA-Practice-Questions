import java.util.*;

public class Pattern {
    public Scanner scn = new Scanner(System.in);

    public static void pattern1(int row){
        int nst = 1;

        for(int r = 1; r <= row; r++){
            for(int csp = 1; csp <= nst; csp++){
                System.out.print("*\t");

            }
            
            nst++;
            System.out.println("");
        }
    }

    public static void main(String args[]){
        // Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        pattern1(r);
    }
}
