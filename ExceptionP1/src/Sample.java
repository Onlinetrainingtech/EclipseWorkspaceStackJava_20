class Demo
{
	void get1()
	{
		try
		{
		int a=100,c;
		c=a/0;
		System.out.println("Your value is::"+c);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check your value.."+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is the normal method..");
	}
	void get3()
	{
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("NullPointerException"+t);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get3();

	}

}
