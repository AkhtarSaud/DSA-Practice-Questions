import java.util.*;

public class create_heap{

    private ArrayList<Integet> arr;
    private int size = 0;


    private void intialize(){ 
        this.arr = new ArrayList<>();
        this.size = 0;
    }

    public heap(){ //constructor
        intialize();
    }

    public heap(int[] arr){ //constructor
        intialize();
      for(int ele : arr){
          this.arr.add(ele);
      }
      for(int i= this.arr.size()-1; i>=0; i--){
          downHeapify(i);
      }
       this.size = this.arr.size();
    }



    public void add(int data){
        this.arr.add(data);
        this.size++;
        upHeapify(this.arr.size()-1);

    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int remove(){  //O(logn)

        int n = this.arr.size();
        int rv = this.arr.get(0);
        swap(0,n-1);
        this.arr.remove(n-1);
        downHeapify(0);
        this.size--;
        return rv;
    }

    public int peek(){
        return this.arr.get(0);
    }

    public void swap(int i, int j){  //O(1)
        int ei = this.arr.get(i);
        int ej = this.arr.get(j);

        this.arr.set(i,ej);
        this.arr.set(j, ei);
    }


    private void downHeapify(int pi){  //O(log(n))
        int maxIdx = pi;
        int lci = 2 * p + 1;
        int rci = 2 * p + 2;

        if(lci < this.arr.size() && this.arr.get(maxIdx)< this.arr.get(lci)){
            maxIdx = lci;
        }
        if(rci < this.arr.size() && this.arr.get(maxIdx) < this.arr.get(rci)){
            maxIdx = rci;
        }
        if(maxIdx != pi){
            swap(maxIdx, pi);
            downHeapify(maxIdx);
        }
    }

    private void upHeapify(int idx){
        int pi = (idx-1)/2;
        if(this.arr.get(idx) > this.arr.get(pi)){
            swap(idx,p);
            upHeapify(p);
        }
    }

}