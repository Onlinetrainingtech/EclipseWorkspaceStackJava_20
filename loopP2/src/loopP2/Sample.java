package loopP2;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int i,n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=5;i>=n;i--)
		{
			fact=fact*i;
		}
		System.out.println("Your fact value is::"+fact);

	}

}
