class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("Baseclass is::"+pid);
	}
}
class D extends B
{
	void get2()
	{
		int pid=2001;
		System.out.println("Dervied class::"+super.pid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
