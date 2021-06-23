import java.util.scanner;
public class l001{

    public static scanner scn = new scanner(System.in);

    public static void workwithdata(){
        int a = 10;
        int b = 20;
    
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
    
    }
    public static void oddeven(){

        int n = 11;
    
        if (n%2 == 0){
            System.out.println("This is an Even Number");
    
        } else {
            System.out.println("This is an Odd Number");
        }
    }
    public static void main(String[] args) {
    
        //workwithdata();
        oddeven();
        int n = scn.nextInt();
    
    }
}

bool Isprime(){
    
}