class Sample extends Thread
{
	synchronized void get1() throws InterruptedException
	{
		System.out.println("WaitIn");
		wait(10000);
		System.out.println("WaitOut");
	}
	synchronized void get2()
	{
		System.out.println("NotifyIn");
		notify();
		System.out.println("NotifyOut");
	}
}
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Sample r1=new Sample();
		r1.get1();
		r1.get2();

	}

}
