package Test;

public class Parent1 
{
	public void p()
	{
		this.p3(1, 2, 3);
		System.out.println("Parent default method");
	}
	
	public void p1(int a)
	{
		this.p();
		System.out.println("Parent one parameterized method");
	}

	public void p2(int a, int b)
	{
		this.p1(1);
		System.out.println("Parent two parameterized method");
	}
	public void p3(int a, int b,int c)
	{
		System.out.println("Parent three parameterized method");
	}
}
