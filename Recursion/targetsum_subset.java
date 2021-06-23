import java.util.*;

public class targetsum_subset {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(targetsum_sets(arr, arr[0], 10, 0, "", ""));

    }

    public static int targetsum_sets(int arr[], int idx, int sum1,  int sum2, String set1, String set2){
        if(idx == arr.length){
            if(sum1 == sum2){
                System.out.println(set1 + " = " + set2);
                return 1;
            }
            return 0;
        }

        int count = 0;

        count += targetsum_sets(arr, idx + 1, sum1 + arr[idx], sum2, set1 + arr[idx] + " ", set2);
        count += targetsum_sets(arr, idx + 1, sum1, sum2 + arr[idx], set1, set2 + arr[idx] + " ");

        return count;
    }
}
