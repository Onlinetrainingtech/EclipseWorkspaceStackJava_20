interface B1
{
	void get1();
}
interface B2 extends B1
{
	void get2();
}
class Demo implements B2
{
	public void get1()
	{
		System.out.println("This is get1 function...");
	}
	public void get2()
	{
		System.out.println("This is get2 function...");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
