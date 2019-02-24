package week1.day1;

import java.util.Scanner;

public class CallAndSendSMS 
{
static int currentBalance = 9;
public static void main(String dd[])
{
MobilePhone mp = new MobilePhone();
System.out.println("Enter the medium of contact:Call/Text:");
Scanner sc = new Scanner(System.in);
String option = sc.next();
while(currentBalance>0)
{
switch (option)
{
case "Call": 
mp.sendSMS(9000812341l, "Good morning! Happy Sunday!");
currentBalance--;
System.out.println("Avaliable Balance is:"+currentBalance);
break;
case "Text":
mp.callContact(9000812341l);
currentBalance = currentBalance-2;
System.out.println("Avaliable Balance is:"+currentBalance);
break;
default:
System.out.println("Invalid option");
break;
}
sc.close();
}
}
}