package firstproject;
import java.util.Scanner;
public class INCRDEC {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value for Increment");
		
		int a = sc.nextInt(); 
		System.out.println("Increment of a is "+(++a));
		System.out.println("Enter a value for Decrement");
		int b = sc.nextInt(); 
		sc.close();
		System.out.println("Decrement of b is "+(--b));
	}

}
