package ifelseblock;

import java.util.Scanner;

class Demo
{
	int empid;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
	   	System.out.println("Enter the empid is::");
	   	empid=sc1.nextInt();
	}
	void get2()
	{
		if(empid==1001)
		{
			System.out.println("Your Employee Id is::: valid");
		}
		else
		{
			System.out.println("Your Employee Id is::not valid");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
