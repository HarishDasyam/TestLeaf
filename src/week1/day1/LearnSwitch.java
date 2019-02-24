package week1.day1;

import java.util.Scanner;

public class LearnSwitch
{
public static void main(String newArgs[])
{
System.out.println("Enter the number one:");
Scanner sc1 = new Scanner(System.in);
int n1= sc1.nextInt();
System.out.println("Enter the number two:");
int n2= sc1.nextInt();
System.out.println("Enter the number three:");
int n38= sc1.nextInt();
System.out.println("Enter the option");
int option= sc1.nextInt();
switch (option) {
case 1:
	System.out.println(n1>n2&&n1>n38);
	break;
case 2:
	System.out.println(n2>n1&&n2>n38);
	break;
case 38:
	System.out.println(n38>n1&&n38>n2);
	break;	
default:
	System.out.println("Invalid option");
	break;
}
/*public static void main(String newArgs[])
{
LearnSwitch ls =new LearnSwitch();
}*/
sc1.close();
}
}