import java.util.Stack;
import java.util.LinkedList;
import java.util.Arrays;


/**********************************************************/

// Queue to stack Adapter

//push Efficient
public QueueToStackAdapter() {
    mainQ = new ArrayDeque<>();
    helperQ = new ArrayDeque<>();
  }

  int size() {
   return mainQ.size();
  }

  void push(int val) {
    mainQ.add(val);
  }

  int pop() {
    if(size() == 0){
        System.out.println("Stack Underflow");
        return -1;
    }
    while(mainQ.size() > 1){
        helperQ.add(mainQ.remove());
    }
    
    int val = mainQ.remove();
    
    while(helperQ.size() > 0){
        mainQ.add(helperQ.remove());
    }
    return val;
    
  }

  int top() {
    if(size() == 0){
        System.out.println("Stack Underflow");
        return -1;
    }
    while(mainQ.size() > 1){
        helperQ.add(mainQ.remove());
    }
    
    int val = mainQ.remove();
    helperQ.add(val);  // last value added here , this is the top
    
    while(helperQ.size() > 0){
        mainQ.add(helperQ.remove());
    }
    return val;
  }
}



//pop efficient

int size() {
    return mainQ.size();
  }

  void push(int val) {
    // write your code here
    
    while(mainQ.size() > 0){
        helperQ.add(mainQ.remove());
    }
    
    mainQ.add(val); //when mainQ is empty Push val to the mainQ
    
    while(helperQ.size() > 0){
        mainQ.add(helperQ.remove());
    }
  }
  

  int pop() {
    // write your code here
    
    if(mainQ.size() == 0){
        System.out.println("stack Underflow");
        return -1;
    }
    else{
        return mainQ.remove();
    }
  }
  
  int top() {
    // write your code here
    
     if(mainQ.size() == 0){
        System.out.println("stack Underflow");
        return -1;
    }
    else{
        return mainQ.peek();
    }
    
  }

/************************************************************/

//Stack to Queue Adapter


// Add Efficient

int size() {
    // write your code here
    return mainS.size();
  }

  void add(int val) {
    // write your code here
    if(size() == 0)
      peekval = val;
   mainS.push(val);    
  }
  void transferToAnotherStack(){
      while(size() !=0){
          helperS.push(mainS.pop());
      }
  }
  int remove() {
    // write your code here
   if(size() == 0){
        System.out.println("Queue underflow");
        return -1;
    }
    else {
  //   transferToAnotherStack();
  while(mainS.size() !=0){
          helperS.push(mainS.pop());
      }
    
    int rData = helperS.pop();
  //   mainS.push(rData);
    while(helperS.size() != 0){
        mainS.push(helperS.pop());
    }
    return rData;
    }
  }

  int peek() {
    // write your code here
   if(size() == 0){
        System.out.println("Queue underflow");
        return -1;
    }
    else {
  //   transferToAnotherStack();
  while(mainS.size() !=0){
          helperS.push(mainS.pop());
      }
    
    int rData = helperS.pop();
    mainS.push(rData);
    while(helperS.size() != 0){
        mainS.push(helperS.pop());
    }
    return rData;
    }




//Remove Efficient





/**********************************/

//normal queue

int size() {
    return size;
  }

  void display() {
    for(int i = 0; i < size; i++){
        int idx = (front + i) % data.length;
        System.out.print(data[idx] + " ");
    }
     System.out.println();
  }

  void add(int val) {
    if(size == data.length){
        System.out.println("Queue overflow");
    } else {
        int rear = (front + size) % data.length;
        data[rear] = val;
        size++;
    }
  }

  int remove() {
    if(size == 0){
        System.out.println("Queue underflow");
        return -1;
    } else {
        int val = data[front];
        front = (front + 1) % data.length;
        size--;
        return val;
    }
  }

  int peek() {
     if(size == 0){
        System.out.println("Queue underflow");
        return -1;
    } else {
        return data[front];
    }
  }


  //Dynamic Queue

  void add(int val) {
    // write ur code here
    if(size == data.length){
      int[] ndata = new int[2 * data.length];
      for(int i = 0; i < size; i++){
          int idx = (front + i) % data.length;
          ndata[i] = data[idx];
      }
      data = ndata;
      front = 0;
      
      int idx = (front + size) % data.length;
      data[idx] = val;
      size++;
    } else {
      int idx = (front + size) % data.length;
      data[idx] = val;
      size++;
    }
  }

/***************************************/


public class questions {
    public static boolean isBalancedBrackets(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (st.size() == 0)
                    return false; // more closing brackets
                else if (ch == ')' && st.peek() != '(')
                    return false;
                else if (ch == '}' && st.peek() != '{')
                    return false;
                else if (ch == ']' && st.peek() != '[')
                    return false;
                else
                    st.pop();
            }
        }

        return st.size() == 0;
    }

    public static int[] NGOR(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
    }

    public static int[] NGOL(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;

    }

    public static int[] NSOR(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, n);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = i;
            }

            st.addFirst(i);
        }
        return ans;

    }
    public static int[] NSOL(int[] arr) {
        int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n - 1; i >= 0 ; i--) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = i;
            }

            st.addFirst(i);
        }
        return ans;

    }

}