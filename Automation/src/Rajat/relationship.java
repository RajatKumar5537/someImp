package Rajat;

public class relationship {
	int a;
	int b;
	relationship (){
		this(4,5);
		System.out.println("Car has a engine");
	}
	relationship (int a, int b){
		//this.a=a;
		//this.b=b;
		
		System.out.println("Car has 4 wheel");
	}
	public void car()
	{
		System.out.println("Ready to drive");
	}
}
