
public class Overloading {
	
	
	
	public static int myFunction (int n1, int n2){
		
		int min;
		
		if(n1==n2)
			
		     min= n1;
		else 
			min=n2;
		
		return min;
	}
	
	// overloading 
	
	public static double myFunction(double n1, double n2){
		
		double min;
		
		if(n1==n2)
		  min = n1 ;
		
		else
			min= n2 ;
		
		return  min;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int b =4;
		int c = myFunction(a,b);
		System.out.println(" yes   "+c);
		
		double e= 2.5;
		double f =4.5;
		
		double g =myFunction(e,f);
		System.out.println(" yes   "+g);
		
		

	}

}
