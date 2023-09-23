package Test;

public class Child_Super_Method extends Parent1
{
	
	public void c()
	{
		System.out.println("Child default method ");
	}
	
	public void c1(int a)
	{
		System.out.println("Child one parameterized method ");
	}
	
	public void c2(int a, int b)
	{
		super.p2(1, 2);
		System.out.println("Child two parameterized method ");
	}
	
	public void c3(int a, int b, int c)
	{
		this.c2(a, b);
		this.c();
		this.c1(c);
		System.out.println("Child three parameterized method ");
	}
	public static void main(String[] args)
	{
		Child_Super_Method obj= new Child_Super_Method();
		obj.c3(1,2,3);

	}

}
