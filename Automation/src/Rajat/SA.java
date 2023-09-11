package Rajat;

public class SA {


	private int acno;
	String ifsc;
	private String name;
	private double bal;

	int getAcno() {
		return acno;
	}
	void setAcno(int acno) {
		this.acno=acno;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	double getBal() {
		return bal;
	}
	void setBal(double bal) {
		this.bal=bal;
	}
	SA(){
	}
	SA(int acno,String ifsc,String name,double bal){
		this.acno=acno;
		this.ifsc=ifsc;
		this.name=name;
		this.bal=bal;
	}
	public void displayDetails() {
		System.out.println("Account Number      : "+acno);
		System.out.println("Account Branch Name : "+ifsc);
		System.out.println("Account Holder Name : "+name);
		System.out.println("Account Balance     : "+bal);
		System.out.println();
	}
	public double deposit(int amt) {
		if (amt>0) {
			bal+=amt;
			System.out.println(amt + " is successfuly credited");
			return bal;
		}
		else {
			System.out.println("Enter valid amount");
			System.out.println(" and the available balance is : "+bal);
			return bal;

		}
		public double withdraw(double amt) {
			if (bal>=amt) {
				bal-=amt;
				System.out.println(amt+ " is debited from your account : "+acno);
				return bal;
			}
			else {
				System.out.println("Insufficient balance...");
				System.out.println(" and the available balance is : "+bal);
				return bal;
			}
		}
	}
}
