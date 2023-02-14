import java.util.Scanner;

class Foo
{
	int age,sal,bns;
	Scanner sc1=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc1.nextInt();
	}
	void get2()
	{
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc1.nextInt();
			if(sal>=1000)
			{
				bns=sal+50;
				System.out.println("Your salary is::"+bns);
				
			}
			else
			{
				bns=sal+100;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
