import java.util.Arrays;

public class Basics {
    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int[] a : arr) {
            print(a);
        }

        System.out.println();
    }

    public static int fibo_memo(int n, int[] dp) {
        if (n <= 1) {   
            return dp[n] = n;
        }

        if (dp[n] != 0)     
            return dp[n];

        int ans = fibo_memo(n - 1, dp) + fibo_memo(n - 2, dp);
        return dp[n] = ans;
    }

    public static int fibo_DP(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = n;
                continue;
            }

            int ans = dp[n - 1] + dp[n - 2];// fibo_memo(n - 1, dp) + fibo_memo(n - 2, dp);
            dp[n] = ans;
        }

        return dp[N];
    }

    public static int fibo_Opti(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        return a;
    }

    public static void fibo() {
        int n = 6;
        int[] dp = new int[n + 1];
        fibo_DP(n, dp);
        System.out.println(fibo_Opti(n));

        print(dp);
    }


    //leetcode 70
    public int climbStairs_memo(int n, int dp[]){
        if(n <= 1){
            return dp[n] = 1;
        }
        
        if(dp[n] != 0)
            return dp[n];
        
        int ans = climbStairs_memo(n-1,dp) + climbStairs_memo(n-2,dp);
        return dp[n]=ans;
    }
    
    public int climbStairs_DP(int N, int dp[]){
        for(int n=0;n<=N;n++){
            if(n <= 1){
                dp[n] = 1;
                continue;
            }


            int ans = dp[n-1] + dp[n-2];
             dp[n]=ans;
        }
        return dp[N];
    }
    public int climbStairs_optimised(int n, int dp[]){
       int a= 1, b =1;
        for(int i=0;i < n; i++){
            int sum = a + b;
            a = b;
            b = sum;
        }
        return a;
        }
    
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        // int step = climbStairs_memo(n,dp);
        // int step = climbStairs_DP(n,dp);
        int step = climbStairs_optimised(n,dp);
        return step;
    }

    //dice throw 
    public static int boardpath_memo(int n, int[] dp){
        if(n==0){
            return dp[n]=1;
        }
        if(dp[n]!=0) return dp[n];

        int count =0;
        for(int dice = 1 ; dice <= 6 && n - dice >=0 ; dice++){
            count+= boardpath_memo(n-dice, dp);
        }
        return dp[n] = count;
    }

    public static int boardpath_DP(int N, int[] dp){
       
        for(int n = 0; n<=N ; n++){
        if(n==0){
             dp[n]=1;
             continue;
        }
        // if(dp[n]!=0) return dp[n];

        int count=0;
        for(int dice = 1 ; dice <= 6 && n - dice >=0 ; dice++){
            count+= dp[n-dice];
        }
        dp[n]=count;
     }
        return dp[N];
    }

    public static void boardpath(){
        int n = 10;
        int[] dp = new int[n+1];
        // System.out.println(boardpath_memo(n, dp));
        System.out.println(boardpath_DP(n, dp));
        print(dp);
    }
    //LPSS : LongestPalindromicSubString 
    public static int LPSS(String str, int i, int j, int[][] dp){
        if(i >= j){
           return dp[i][j] = (i == j) ? 1 : 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(str.charAt(i) == str.charAt(j)){
           return dp[i][j] = LPSS(str, i + 1, j - 1, dp) + 2;
        } else {
            return dp[i][j] = Math.max(LPSS(str, i + 1, j, dp), LPSS(str, i + 1, j - 1, dp));
        }
    }

    public static int LPSS_DP(String str, int I, int J, int[][] dp){
        int n = str.length();
        for(int gap = 0; gap < n; gap++){
            for(int i = 0, j = gap; j < n; i++, j++){
                if(i >= j){
                    dp[i][j] = (i == j) ? 1 : 0;
                    continue;
                 }
         
                 if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = dp[i+ 1][j-1] + 2; //LPSS(str, i + 1, j - 1, dp) + 2;
                 } else {
                    dp[i][j] = Math.max(dp[i+ 1][j], dp[i][j-1]);
                 }
            }
        }
        return dp[I][J];
    }

    public static void LPSS(){
        String str = "geeksfgeek";
        int[][] dp = new int[str.length()][str.length()];

        for(int[] d : dp){
            Arrays.fill(d, -1);
        }
        System.out.println(LPSS(str, 0, str.length() - 1, dp));
        print2D(dp);

    }


    public static void main(String[] args) {
        LPSS();
    }
}