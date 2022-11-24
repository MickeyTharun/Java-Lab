package firstproject;
import java.util.Scanner;

public class ifstatement {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter any number :");
		int num =read.nextInt();
		read.close();
		if ((num % 5)== 0) {
			System .out.println("We are inside the if-block!");
			System .out.println("Given number is divisible by 5!!");
		}
		System.out.println("We are outside the if-block!!!!!");
	}
	
	

}
