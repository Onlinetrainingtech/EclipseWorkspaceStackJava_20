
public class SampleP1 
{

	void ArithmeticOperators()
	{
        int s1=100,s2=200;
        System.out.println("Add::"+(s1+s2));
        System.out.println("Sub::"+(s1-s2));
        System.out.println("Multiple::"+(s1*s2));
        System.out.println("Divided::"+(s1/s2));
	}
	void ComparisionOperator()
	{
		int a1=100,b1=50;
		
		System.out.println("lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("NotEqual::"+(a1!=b1));
	}
	void logicalOperator()
	{
		int f1=200,f2=100;
		System.out.println("LoginAND::"+((f1>f2)&&(f2<f1)));
		System.out.println("LoginOR::"+((f1>f2)||(f2>f1)));
	}
	void bitwise()
	{
		int a1=3,b1=2;
		System.out.println("BitwiseAND::"+((a1&b1)));
		System.out.println("BitwiseOR::"+((a1|b1)));
		System.out.println("leftshift::"+(a1<<1));
		System.out.println("rightshift::"+(a1>>1));
	}
	
	
	
	
	public static void main(String[] args) {
		
		SampleP1 d1=new SampleP1();
		//d1.ArithmeticOperators();
		//d1.ComparisionOperator();
		d1.bitwise();
		

	}

}
