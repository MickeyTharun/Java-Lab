package firstproject;
import java.util.Scanner;
public class example {
	int a,b; // declare two variables
	//creating object for scanner class
	Scanner sc=new Scanner(System.in);
	//create method to accept a values
	void getdata()
	{
		System.out.println("Enter the two  numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		
	}
	//void process()//create method to do operations
	//{
		//a++;
		//b++;
		
	//}
	void display() {
		System.out.println("a:"+a+"b :"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example d=new example();
		d.getdata();
		//d.process();
		d.display();
		
	}

}
