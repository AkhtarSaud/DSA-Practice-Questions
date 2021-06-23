// import java.util.scanner;

// public class wavetransmission{
    
//     public static scanner scn = new scanner(system.in);

//     public static input()

//     public static void wave1( int a[], int a , int b){
    
        
//     }

//     public static void main(String[] args) {
//         // package conditionalStatement;

import java.util.Scanner;
public class wavetransmission {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your gender *FOR EXAMPLE F OR M OR T");
		String s = sc.nextLine();
		if (s.equals("F")) {
			System.out.println("HI GIRL HOW ARE YOU");
		}
		else if(s.equals("M")) {
			System.out.println("HI BOY HOW ARE YOU");
		}
		else{
			System.out.println("HI DUDE HOW ARE YOU");
		}
		
		sc.next();
		System.out.println("enter the number of letters in your name ");
		
		int noOfPetals = sc.nextInt();
		if(noOfPetals%2 == 0) {
			System.out.println("he/she loves me");
		
		}else if (noOfPetals % 3==0) {
			System.out.println("he/she loves me not");
		}else {
			System.out.println("bhai/bhn tera katne wala hai");
		}
	}
}