package PragrammingClass;

import java.util.Scanner;

public class Lar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  subject1 marks");
		int s1=sc.nextInt();
		System.out.println("enter subject2 marks");
		int s2=sc.nextInt();
		System.out.println("enter subject3 marks");
		int s3=sc.nextInt();
		System.out.println("enter subject4 marks");
		int s4=sc.nextInt();
		System.out.println("enter subject 5 marks");
		int s5=sc.nextInt();
		System.out.println("enter subject 6 marks");
		int s6=sc.nextInt();
		int sumOfMarks=s1+s2+s3+s4+s5+s6;
		double result=sumOfMarks/(600/100);
		System.out.println(result);
		if(result<35)
		{
			System.out.println("student is fail");
		}
		else if(result>=35&&result<=60)
		{
			System.out.println("student is first class");
			
		}
		else if(result>=70&&result<=80)
		{
			System.out.println("student is distinction");
		}
		else if (result>=90)
		{
			System.out.println("student is rank");
		}
		
			
		}
		
	}


				
			
			
		
			
		
		
	



