
public class Sample {

	String pname="apple";//class or instance variable
	void get1(int cid,String cname)//Argument Passing
	{
		int pid=1001;//local variable
		System.out.println("This is get1 method.."+pid);
		System.out.println("CategoryId::"+cid+"CategoryName"+cname);
	}
	void get2(int empid,String empname)
	{
		System.out.println("This is get2 method.."+pname);
		System.out.println("EmployeeId::"+empid+""+empname);
	}
	
	public static void main(String[] args)
	{
	   
		Sample s1=new Sample();
		s1.get1(2001,"mobile");
		s1.get2(3001,"azar");

	}

}
