package Test;

import java.util.Scanner;

public class ScannerExample1 
{

	int x1,x2,x3,x4,x5,x6;
	
	public void inputvalue()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value for x1 ");
		x1= s1.nextInt();
		
		System.out.println("Enter value for x2 ");
		x2= s1.nextInt();
		
		System.out.println("Enter value for x3 ");
		x3= s1.nextInt();
		
		System.out.println("Enter value for x4 ");
		x4= s1.nextInt();
		
		System.out.println("Enter value for x5 ");
		x5= s1.nextInt();
		
		System.out.println("Enter value for x6 ");
		x6= s1.nextInt();
		
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int finalExpression()
	{
		int ans= this.mul(x1, x2);
		int ans1= this.sub(ans, x3);
		int ans2= this.sum(ans1,x4);
		int ans3= this.sub(ans2, x5);
		int ans4= this.div(ans3, x6);
		
		return ans4;
				
	}
	public static void main(String[] args) 
	{
	 ScannerExample1 ob= new ScannerExample1();
	 ob.inputvalue();
	 System.out.println("Answer of expression (((((x1*x2)-x3)+x4)-x5)/x6) is "+ ob.finalExpression());
	}

}
