class Demo
{
	void get1(int pid)
	{
		System.out.println("Your Pid is::"+pid);
	}
	void get1(int empid,String ename)
	{
		System.out.println("Your empid and empname is::"+empid+""+ename);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001);
		f1.get1(2001,"azar");

	}

}
