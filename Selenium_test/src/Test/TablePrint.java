package Test;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
		
		for (int i=1; i<=10; i=i+1)
		{
			System.out.println(no1 + " X " + i + " = " + no1*i);
		}
		

	}

}
