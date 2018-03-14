
import java.util.*;
public class Add {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a,b,add;
//		
//		Scanner buf=new Scanner(System.in);
//		
//		System.out.println("Enter 1st no");
//		a=buf.nextInt();
//		System.out.println("Enter 2nd no");
//		b=buf.nextInt();
//		
//		add=a+b;
//		
//		System.out.println(" add  total number  "+add);
		
		try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[1]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      System.out.println("Out of the block");
		

	}

}
