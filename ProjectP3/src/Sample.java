import java.util.Scanner;

class Demo
{
	int empid;
	String empname;
	float avg;
	Scanner s1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid::");
		empid=s1.nextInt();
		System.out.println("Enter the empname::");
		empname=s1.next();
		System.out.println("Enter the Average::");
		avg=s1.nextFloat();
	}
	void get2()
	{
		System.out.println("Your value is::"+empid);
		System.out.println("Your value is::"+empname);
		System.out.println("Your value is::"+avg);
	}
}

public class Sample {

	
	public static void main(String[] args) {
		

		Demo t1=new Demo();
		t1.get1();
		t1.get2();
		
	}

}
