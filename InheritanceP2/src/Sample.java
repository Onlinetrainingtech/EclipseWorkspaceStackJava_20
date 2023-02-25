class B
{
	int cid=1001;
	void get1()
	{
		System.out.println("Your value is::"+cid);
	}
}
class D1 extends B
{
	String cname="mobile";
	int price=1000;
	void get2()
	{
		System.out.println("Your value is::"+cname);
	}
}
class D2 extends D1
{
	void get3()
	{
	   System.out.println("Your Price is::"+price);	
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
