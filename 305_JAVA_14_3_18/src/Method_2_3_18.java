
public class Method_2_3_18 {
	
	
	/// Create method
	
	public static int  myFunction(int n1 , int n2 ){
		
		int min ;
		
		if(n1 <=n2)
			
		 min=n1 +5000;
		else
			min=n2;
		
		return min ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2;
		int b =4;
		int c= myFunction(a,b);
		
		System.out.println(" yes " +c);

	}
	
	

}
