abstract class Demo
{
	abstract void get2();
	void get1()
	{
		System.out.println("This is the Normal Method..");
	}
}
class Foo extends Demo
{
	public void get2()
	{
		System.out.println("This is a Abstract method");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
