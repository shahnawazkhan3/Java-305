
public class Car implements Suzuki {

	
	public void fast(){
		
		System.out.println("fast");
		
	}
   public void slow(){

	   System.out.println("slow");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car o =new Car();
       o.fast();
       o.slow();
	}

}


