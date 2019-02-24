package week1.day1;

import java.util.Scanner;

public class LearnConditions 
{
//static int number =38;
public static void main(String[] args)
{
	System.out.println("Enter three values");
	Scanner sc1 = new Scanner(System.in);
	int new1 = sc1.nextInt();
	int new2 = sc1.nextInt();
	int new3 = sc1.nextInt();
	if(new1>new2&&new1>new3)
	{
	System.out.println(""+new1+" is greatest");
	}
	else if(new2>new1&&new2>new3)
	{
	System.out.println(""+new2+" is greatest");	
	}
	else
	{
	System.out.println(""+new3+" is greatest");
	}
	sc1.close();
}
}