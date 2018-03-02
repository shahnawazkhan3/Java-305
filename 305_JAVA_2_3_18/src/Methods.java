
public class Methods {

	
	// method get and SET
	
	  Methods(){
		  
		 	System.out.println("contrator");
	 }
	
	
    public String name ;
    public int number;
    public 	String  lastName;
    public int Salary;
    
    
    
	  public void setName (String Sname){
		  
		  this.name=Sname;
	  } 
	  
	  
	  // GET NAME
	  
	  String getName (){
		  return name ;
	  }
	  ///
	  public void setSalry(int Ssalry){
		  this.Salary=Ssalry;
	  }
	  
	  int getSalary(){
		  return Salary*2; 
	  }
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// OBJECT CREATE
		 
		Methods obj = new Methods();

		
		obj.setName("shah");
		obj.getName();
		obj.setSalry(200);
		obj.getSalary();
		System.out.println("name = "+obj.getName() );
		System.out.println("  salary = " +obj.getSalary());
		

	}

}
