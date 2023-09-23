package Test;

public class Child_Super extends Parent
{
	public Child_Super()
	{
		this(1,2);
		System.out.println("Child default constructor");
	}
	
	public Child_Super(int a)
	{
		this(1,2,3);
		System.out.println("Child one paramererized constructor");
	}

	public Child_Super(int a, int b)
	{
		super(1);
		System.out.println("Child two paramererized constructor");
	}
	
	public Child_Super(int a, int b, int c)
	{
		this();
		System.out.println("Child three paramererized constructor");
	}

	public static void main(String[] args)
	{
		Child_Super ob= new Child_Super(1);
		
	}

}
