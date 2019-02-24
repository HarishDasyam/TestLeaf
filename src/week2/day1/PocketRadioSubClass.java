package week2.day1;
public class PocketRadioSubClass extends RadioAbstractClass
{

	@Override
	public void changeBattery() 
	{
	System.out.println("Battery Changed");	
	}
	//public abstract void pocketRadioMethod();
	public static void main(String dd[])
	{
	//RadioAbstractClass rc = new RadioAbstractClass();
	PocketRadioSubClass pc = new PocketRadioSubClass();
	pc.changeBattery();
	pc.playStation();
	}
}