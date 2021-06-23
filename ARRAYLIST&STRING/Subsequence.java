import java.util.ArrayList;
import java.util.Scanner;


public class Subsequence {
    public static ArrayList<String> subseq(String str){
        ArrayList<String> ans = new ArrayList<>();

        ans.add("");

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int size = ans.size();
            for(int j = 0; j < size; j++){
                ans.add(ans.get(j) +ch);
            }
        }
        return ans;
    }
    
    public static boolean isPalindrome(int x) {
        int si = 0, ei = String.valueOf(x).length() - 1;;
            
        while(si < ei){
            if(si++ != ei--){
                    // si++;
                    // ei--;
                return false;
            }        
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String str = scn.next();
        // System.out.println(subseq(str));

        int n = scn.nextInt();
        isPalindrome(n);
    }
}
