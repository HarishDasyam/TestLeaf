package week1.day1;
public class MobilePhone
{
int simCardOptions;
String modelName;
String imeiNumber;

void callContact(long mobileNumber)
{
System.out.println("Calling to :"+ mobileNumber);
}
public void sendSMS(long mobileNumber,String message)
{
System.out.println(message+"to :"+mobileNumber);
}
}