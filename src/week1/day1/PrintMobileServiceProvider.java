package week1.day1;

import java.util.Scanner;

public class PrintMobileServiceProvider
{
public static void main(String dd[])
{
System.out.println("Enter first 3 digits of mobile number:");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
if(num == 944)
{
System.out.println("Service Provider is:BSNL");	
}
else if(num == 900)
{
System.out.println("Service Provider is :Airtel");
}
else if(num == 897)
{
System.out.println("Service Provider is: Idea");
}
else if(num == 630)
{
System.out.println("Service Provider is: JIO");
}
else
{
System.out.println("Service Provider is not present");	}sc1.close();

}
}