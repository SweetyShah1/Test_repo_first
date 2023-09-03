package Test;

public class Student 
{
	int RollNO, Age;

	public void Display1()
	{
		System.out.println("Welcome to all of us ");
	}

	public void Display2()
	{
		System.out.println("Automation is very easy ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student st1= new Student();
			st1.Age= 25;
			st1.RollNO= 42;
			
			System.out.println("Roll no is "+ st1.RollNO);
			System.out.println("Age is "+ st1.Age);
			
			System.out.println("Testing ");
			st1.Display1();
			st1.Display2();
	}

}

