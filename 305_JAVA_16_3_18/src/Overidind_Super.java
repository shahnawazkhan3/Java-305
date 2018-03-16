
public class Overidind_Super {
	
	 public void move() {
	      System.out.println("MAIN CLASS");
	   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog b = new Dog();   // Animal reference but Dog object
	      b.move();   // runs the method in Dog class

	}

}


class Animal  extends Overidind_Super {
	
	   public void move() {
	      System.out.println("Animals can move");
	   }
	   
	}

	class Dog extends Overidind_Super {
		
	   public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}

