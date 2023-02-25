
public interface Sample
{
   int pid=1001;
   void get1();
}
class SampleP1 implements Sample
{
	public void get1()
	{
		System.out.println("Your value is::"+pid);
	}
	
	public static void main(String as[])
	{
		SampleP1 f1=new SampleP1();
		f1.get1();
	}
}
