import java.io.*;
import java.util.*;

public class Main{
  public static void Binarysearch(int[] arr, int data) {

    int si = 0; ei = arr.length -1;
    while(si <= ei){
        int mid = (si+ei)/2;
        if(arr [mid] == data){
            return mid;
        } elseif(data < arr[mid]) {
            ei = mid - 1;
        
        } else si = mid +1;
    }
    return - 1;
  }

public static void main(String[] args) {
    

}