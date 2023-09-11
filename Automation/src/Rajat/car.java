package Rajat;

public class car {
	String colour;
	double price;
	
	relationship r= new relationship();
	car (){
		System.out.println("Car's colour is : "+colour);
		System.out.println("Car's price is  : "+price);
	}
	car(String colour, double price){
		this();
		this.colour=colour;
		this.price=price;
		
	}
	public void c() {
		new car("Black",1000000);
		System.out.println("Car's cost is 1200000");
	}
}
