package Rajat;

public class chaining {
	chaining (){
		this(4);
		System.out.println("HI..");
	}
	chaining (int a){
		System.out.println("Good Mornig");
	}
	chaining (int a, int b){
		this();
		System.out.println("How are you");
	}
	public static void main(String[] args) {
		
		
	}

}
