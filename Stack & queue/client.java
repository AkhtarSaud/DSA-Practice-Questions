import java.util.Stack;

public class client {
    public static void main (String[] args) throws Exception{
            stack st = new stack(6);
            for (int i = 1; i < 5; i++){
                st.push(i);
            }
            

            while(st.size() != 0){
                System.out.println(st.pop());
            }
    }
}
