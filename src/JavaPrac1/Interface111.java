package JavaPrac1;



	abstract class Vehicle
	{
		abstract void start();
		
		interface Engine
		{
			
			void fuelType();
		}
	}
	
	class Car extends Vehicle implements JavaPrac1.Vehicle.Engine
	{
		
		public void start()
		{
			System.out.println("Car engine started");
		}
		
		public void fuelType()
		{
			
			System.out.println("Car fuel is petrol");
		}
		
	}
	
	class Bike extends Vehicle
	{
		
		public void start()
		{
			System.out.println("Bike engine started ");
		}
		
		public void fuelType()
		{
			
			System.out.println("Bike fuel is petrol");
		}
		
	}
	
	class Interface111
	{
	
	public static void main(String[] args) {

Car c1= new Car();
c1.start();
c1.fuelType();
Bike b1= new Bike();
b1.start();
b1.fuelType();

	}

}
