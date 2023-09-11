package Rajat;

public class SavingAccount {

	long acno;
	String name;
	String branch;
	double bal;
	StringBuilder  bal1=new StringBuilder();

	SavingAccount (){}
	SavingAccount(long acno,String name,String branch,double bal){
		this.acno=acno;
		this.name=name;
		this.branch=branch;
		this.bal=bal;

	}
	void display() {
		System.out.println("Account Number      : "+acno);
		System.out.println("Account Holder Name : "+name);
		System.out.println("Account Branch Name : "+branch);
		System.out.println("Account Balance     : "+bal);
		System.out.println();
	}
	public double deposite (double amt) {
		if (amt>0) {
			bal+=amt;
			bal1.append(bal);
			System.out.println("Length: "+bal1.length());
			if (bal1.length()==6)
			{
				bal1.insert(1, ',');
			}
			else if (bal1.length()==8)
			{
				bal1.insert(1, ',');
				bal1.insert(4, ',');
			}
			else if (bal1.length()==7)
			{
				bal1.insert(2, ',');


			}

			System.out.println(amt + " is successfully credited to your account jaleel aj-7 "+acno);
			System.out.println(" and the updated balance in euro"+bal1);


			//System.out.println("bal1: "+bal1);
			return bal;
		}
		else {
			System.out.println("Enter valid amount");
			return bal;
		}
	}
}


