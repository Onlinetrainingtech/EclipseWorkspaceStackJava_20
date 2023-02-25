class B
{
	int pid=1001;
	String pname="apple";
	void get1()
	{
		System.out.println("Your pid is::"+pid);
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your ProductName is::"+pname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
