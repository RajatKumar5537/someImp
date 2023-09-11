package Rajat;

public class Driver1 {

	public static void main(String[] args) {
		/*SavingAccount sa= new SavingAccount(7768996878l,"jaleel aj-7","SBI",600000);
		sa.display();
		sa.deposite(100000);*/
		SA s= new SA();
		System.out.println("Account Number      : "+s.getAcno());
		System.out.println("Branch Code         : "+s.ifsc);
		System.out.println("Account Holder Name : "+s.getName());
		System.out.println("Account Balance     : "+s.getBal());
		s.setAcno(100);
		
		s.setName("Rajat");
		s.setBal(45000);
		s.displayDetails();
	}

}
