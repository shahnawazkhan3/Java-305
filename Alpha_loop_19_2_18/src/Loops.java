
public class Loops {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//// FOR LOOP
		
		
//		for(int i = 0; 10>i; i++){
//			System.out.println("yes"+i);
//		}

		
		///While loop
		
//		int i =5;
//		
//		while (10>i){
//			i++;
//			System.out.println("yes"+i);
//		}
		
		
		/// do while loop
		
//		int i =0;
//		
//		do {
//			
//			System.out.println("values :");
//			i++;
//		
//			
//		}while(10>i);
		
		
		/// ForeEACH LOOP
		
		String[] name = {"s","b" ,"c"};
		
		for ( String x : name){
			
			System.out.println(x);
		}
		
//		int [] numbers = {12,23,30,33,22};
//		for (int x : numbers ) {
//			
//		      if( x ==23){
//		    	  break;
//		    	  
//		    	  
//		      }
//			
//			 System.out.println("" +x );
//	         System.out.print("\n");
//		}
//		
		  int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
		
		
	}

}
