import java.util.Scanner;

class Demo
{
	int m1,m2,m3,tot;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the Marks::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
	}
	void get2()
	{
		if(tot>=900)
		{
			System.out.println("Grade-A");
		}
		else if(tot>=700)
		{
			System.out.println("Grade-B");
		}
		else if(tot<=500)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-D");
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
