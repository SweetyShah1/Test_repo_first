package Test;

import java.util.Scanner;

public class swap2nowithout3rdvariable {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
		
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter No2 ");
		int no2 = s2.nextInt();
		
		System.out.println("No1 is   "+ no1);
		System.out.println("No2 is "+ no2);
		
		no1= no1+no2;
		no2=no1-no2;
		no1= no1-no2;
		
		System.out.println("After swapping ");
		System.out.println("No1 is "+ no1);
		System.out.println("No2 is "+ no2);

	}

}
