class Demo
{
	int pid;
	String pname;
	void get1(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
		System.out.println(""+pid+""+pname);
	}
	void display()
	{
		System.out.println("Display function is::"+pid+""+pname);
	}
}
public class SampleP1 {

	public static void main(String[] args) {
	
		Demo t1=new Demo();
		t1.get1(1001,"apple");
		t1.display();

	}

}
