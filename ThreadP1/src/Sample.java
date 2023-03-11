class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadName::"+currentThread().getName());
			System.out.println("ThreadPriority::"+currentThread().getPriority());
			System.out.println("ThreadIN");
			Thread.sleep(10000);
			System.out.println("ThreadOUT");
		}
		catch(InterruptedException r)
		{
			
		}
		System.out.println("This is run method..");
	}
	void get1()
	{
		System.out.println("This is normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		t1.start();
		t2.start();
		t1.get1();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

	}

}
