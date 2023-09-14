package Test;

public class this_method_prac 
{
	public void method()
	{
		System.out.println("Default Method");
	}
	
	public void method1(int i)
	{
		this.method3(10,20,30);
		this.method2(10, 20);
		this.method4(10, 20, 30, 40);
		this.method();
		System.out.println("One parameterized Method");
	}
	public void method2(int i, int j)
	{
		System.out.println("Two parameterized Method");
	}
	public void method3(int i, int j, int k)
	{
		System.out.println("Three parameterized Method");
	}
	public void method4(int i, int j, int k, int l)
	{
		System.out.println("Four parameterized Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_method_prac obj= new this_method_prac();
		obj.method1(10);
	}

}
