
public class Switch1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String foodMenu ="Burger";
		String vagitable ="Vburger";
		
		switch (foodMenu){
		case  "Ice Burger" : 
			System.out.println("burger");
			break;
		case "Burger": 
			System.out.println("burger A");
			
			switch (vagitable){
			case "Vburger":
				System.out.println("Vburger B");
				break;	
			}
			
			break;
		case "Sburger": 
			System.out.println("Sburger");
			break;
		
			
		
		}
		
	}

}
