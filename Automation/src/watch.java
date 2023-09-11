
public class watch {

	String brand;
	private double price;
	private int slno;
	String colour;

	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price=price;
	}
	int getSlon() {
		return slno;
	}
	void setSlno(int slno) {
		this.slno=slno;
	}
	watch (){
	}
	watch (String brand,double price,int slno,String colour){
		this.brand=brand;
		this.price=price;
		this.slno=slno;
		this.colour=colour;
	}
	public void displayDetail() {
		System.out.println("Brand of the Watch : "+brand);
		System.out.println("Price of the Watch : "+price);
		System.out.println("Slno of the Watch  : "+slno);
		System.out.println("Colour of the Watch : "+colour);
		System.out.println();
	}

}
