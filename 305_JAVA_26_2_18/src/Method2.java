
public class Method2 {
	
	
	
	// CALING METHOD
	
//	public static int mainFunction (int n1 , int n2){
//		
//		int min;
//		
//		if(n1> n2)
//			
//		   min =n2;
//		else 
//			
//			min =n1;
//		
//		return min;
//	}
//	
	
	//================Method Overloading============
	
	public static int run(int a,int b){
		int min;
		
		if(a ==b)
		min =a;
		else 
		min =b;	
			
		return min;
	}
	
	
	public static double run (double a, double b){
	
		double min;
		
		if(a==b)
	      	min = a;
		else 
			min =b;
		return min ;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =2;
		int y=2;
	int z = run(x,y);
	
	System.out.println(" overloding " +z);
	
	double c =2.5;
	double  f =4.5;
	
	double  g =run(c,f);
	
	System.out.println(" print  " +g);

//		int  x =6;
//		int y =4;
//		
//		int z =mainFunction(x,y);
//		
//		System.out.println("value Z   "+z );
		
	}

}
