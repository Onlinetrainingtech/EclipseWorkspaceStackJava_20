class Demo
{
	Demo()
	{
		System.out.println("This is default cons..");
	}
	Demo(int p1,String pname)
	{
		System.out.println(p1+""+pname);
	}
	void get1()
	{
		System.out.println("This is normal method..");
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		new Demo(1001,"mobile");
		f1.get1();
	

	}

}
