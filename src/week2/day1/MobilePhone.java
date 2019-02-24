package week2.day1;
public class MobilePhone implements TRAI,WTO
{
	public void mobmakeCall()
	{
	System.out.println("This is Child Class Method1");
	}
	public void voiceRecord()
	{
	System.out.println("This is Child Class Method1");
	}
	@Override
	public void dualSIM() 
	{
	System.out.println("I'm implementing WTO dual sim method");	
	}

	@Override
	public void imei() {
		// TODO Auto-generated method stub
		System.out.println("I'm implementing WTO imei method");	
	}

	@Override
	public void frequecy() {
		// TODO Auto-generated method stub
		System.out.println("I'm implementing TRAI frequency method");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("I'm implementing TRAI sendSMS method");
	}

	@Override
	public void enableFingerPrint() {
		// TODO Auto-generated method stub
		System.out.println("I'm implementing TRAI enable fingerprint method");
	}
}