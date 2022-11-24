package firstproject;
import java.io.*;
public class shift {
	public static void main(String[] args) throws IOException {
	    int a = 10       ;
	    
	    System.out.println("The result after performing left shift " + (a << 2));
	    System.out.println("The result after performing right signed shift " + (a >> 2));
	    System.out.println("The result after performing right unsigned shift " + (a >>> 2));
	  }


}
