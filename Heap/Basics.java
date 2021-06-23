import java.util.*;
public class Basics2 {

    public static void MinPQ() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default min PQ.
        for (int i = 10; i >= 0; i--) {
            pq.add(i);
        }

        while (pq.size() != 0) {
            int ele = pq.remove();
            System.out.print(ele + " ");
        }

    }

    public static void MaxPQ() {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            // return a - b; // this - other, default behaviour.
            return b - a; // other - this, reverse of default.
        }); 

        for (int i = 10; i >= 0; i--) {
            pq.add(i);
        }

        while (pq.size() != 0) {
            int ele = pq.remove();
            System.out.print(ele + " ");
        }

    }

    public static void kLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)   pq.remove();
        }

        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    public static void kSmallest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            return b - a;
        });

        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k)   pq.remove();
        }

        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< arr.length ; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
       PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
           return a[1]-b[1];
       });
        for(Integer ele : hm.keySet()){
            int val = ele;
            int freq = hm.get(val);
            pq.add(new int[]{val, freq});
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans = new int[k];
        int i=0;
        while(pq.size()!=0){
            ans[i++]=pq.remove()[0];
        }
        return ans;
    }

    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> rv = new ArrayList<>();
  
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
           return a[0] - b[0]; 
        });
        
        for(int i = 0; i < lists.size(); i++){
            pq.add(new int[] {lists.get(i).get(0), 0, i} );
        }
        
        while(pq.size() != 0){
            int[] arr =  pq.remove();
            rv.add(arr[0]);
            
            int idx = arr[1];
            int listsidx = arr[2];
            int length = lists.get(listsidx).size();
            
            if(idx + 1 < length){
                arr[1]++;
                arr[0] = lists.get(listsidx).get(idx + 1);
                pq.add(arr);
            }
        }
  
        return rv;
     }

     public static ArrayList<Integer> mergeTwoSortedList(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, n = list1.size();
        int j = 0, m = list2.size();

        while(i < n && j < m){
            if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i++));
            } else {
                ans.add(list2.get(j++));
            }
        }

        while(i < n){
            ans.add(list1.get(i++));
        }

        while(j < m){
            ans.add(list2.get(j++));
        }

        return ans;
     }

     public static ArrayList<Integer> mergeSortedList(ArrayList<ArrayList<Integer>> list, int si , int ei){
        if(si == ei)    return list.get(si);
        
        int mid = (si + ei) / 2;
        ArrayList<Integer> list1 = mergeSortedList(list, si, mid);
        ArrayList<Integer> list2 = mergeSortedList(list, mid + 1, ei);

       return mergeTwoSortedList(list1, list2);

     }
}
