
public class Home2  {


	
	public String name;

	
	public void setName  (String Sname){
		
	    this.name=Sname;
	}
	
	String getName (){
		return name;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Home2 obj =new Home2();
		Id obj2 = new Id();
		
	      obj.setName("shah");
	      obj.getName();
	      obj2.setId(3434);
	      obj2.getId();
	      
	      System.out.println("  name home 2 "+obj.getName());
	      System.out.println(" id ID "+obj2.getId());
	}

}



class Id extends Home2 {
	
	  protected int Id ;
	  
	  public void setId(int Sid){
		  this.Id=Sid;
	  }
	  
	 int getId(){
		 return Id;
	 }
	 
	 
}