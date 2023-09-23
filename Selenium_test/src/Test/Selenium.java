package Test;

public class Selenium extends Automation
{
	public void m1()
	{
		System.out.println("Child class method");
	}
	

	public static void main(String[] args)
	{
		Selenium s1=  new Selenium();
		s1.method1();
		s1.method2();
		s1.m1();
		s1.a= 12;
		
		System.out.println("Value of parent class variable "+ s1.a);
	}

}
