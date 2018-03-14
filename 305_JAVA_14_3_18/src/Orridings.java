
public class Orridings {

	
	public void BarCode(){
		System.out.println("cLAS amin");
		
	}
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		B b =new B();
		C c= new C();
		
		b.BarCode();
		c.BarCode();
		

	}

}



class B  extends Orridings{
	
	public void BarCode(){
		System.out.println("cLAS b");
		super.BarCode();
		
	}
	
}


class C extends Orridings{
	
	public void BarCode(){
		System.out.println("cLAS C");
	}
}



