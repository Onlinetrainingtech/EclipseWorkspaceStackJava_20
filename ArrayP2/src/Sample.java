import java.util.Scanner;

class Demo
{
	int empid[][]=new int[2][2];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
	   System.out.println("Enter the n and m value is::");
	   n=sc.nextInt();
	   m=sc.nextInt();
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   System.out.println("Enter the array value::");
			   empid[i][j]=sc.nextInt();
		   }
	   }
	}
	void get2()
	{
		for(i=0;i<n;i++)
		   {
			   for(j=0;j<m;j++)
			   {
				   System.out.println("Your value is::"+empid[i][j]);
				   
			   }
		   }
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();
		t1.get2();

	}

}
