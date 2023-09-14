package Test;

public class Constructor_practise_this {
	
	int i;
	
	public Constructor_practise_this()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}

	public Constructor_practise_this(int para)
	{
		this();
		System.out.println("One parameterized constructor");	
	}

	public Constructor_practise_this(int para, int para1)
	{
		this(10);
		System.out.println("Two parameterized constructor");	
	}
	
	public Constructor_practise_this(int para, int para1, int para2)
	{
		
		System.out.println("Three parameterized constructor");	
	}
	
	public Constructor_practise_this(int para, int para1, int para2, int para3)
	{
		this(10,20);
		System.out.println("Four parameterized constructor");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_practise_this ob1= new Constructor_practise_this(10,20,30,40);
	}

}
