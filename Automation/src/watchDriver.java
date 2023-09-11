
public class watchDriver {

	public static void main(String[] args) {
		watch w=new watch("Fast Track",5000,8796,"Black");
		System.out.println(w.getPrice());
		w.displayDetail();
		watch w1=new watch("Fast Track",5900,1976,"Brown");
		w1.displayDetail();
	}

}
