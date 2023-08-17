package oops;


	
	
	class Bike1 {  
		  void run() { System.out.println("running"); }  
		}  

		class Splendor extends Bike1 { 
			
			
			
		  void run() { 
			  System.out.println("running safely with 60km"); 
		  
		  }  
		  public class Test{
			  
		  
		  public static void main(String args[]) {  
		    Bike1 b = new Splendor(); // upcasting  
		    Bike1 b1 = new Bike1();
		    b.run();  
		    b1.run();  
		  }  
		}
		}


