package Test;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter No1 ");
		int no1= s1.nextInt();
	    int temp=no1;
		int sum=0,r;
		while(no1>0)
		{    
		   r=no1%10;  //getting remainder
		   sum= sum + (r*r*r);    
		   no1=no1/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Armstrong Number ");    
		  else    
		   System.out.println("Not Armstrong Number");    
		
		
	}

}
