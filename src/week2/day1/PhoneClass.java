package week2.day1;
public class PhoneClass extends MobilePhone
{
void dial()
{
System.out.println("I'm Phone Class Dial method");	
}
void speaker()
{
System.out.println("I'm child Phone Class Speaker Method");
}
public void mobmakeCall()//overridden method from parent calss
{
System.out.println("This is Child Class Method1");
}

public static void main(String[] dd)
{
MobilePhone mp = new MobilePhone();
mp.sendSMS();
mp.mobmakeCall();
mp.enableFingerPrint();
//mp.speaker(); cannot call child methods
PhoneClass pc = new PhoneClass();//pc can call all methods of its class and parent class
pc.speaker();
pc.sendSMS();
pc.mobmakeCall();
MobilePhone mc = new PhoneClass();
mc.mobmakeCall();//now it calls child class method
//mc.speaker(); mc cannot call PhoneClass methods
//PhoneClass pp = new MobilePhone(); cannot do this
}
}