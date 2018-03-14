
public class Exceptions1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] a= new int[2];
		int b = 5;
		
		
		try{
			
			
			System.out.println("try exp" +a[1]);
			
		}catch(Exception e ){
			
			System.out.println("block catch "+e);
		}
	}

}
