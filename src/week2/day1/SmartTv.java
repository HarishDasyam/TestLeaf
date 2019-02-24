package week2.day1;

public class SmartTv extends Television{

	public void internet()
	{
		System.out.println("internet");
	}
	public void youTube()
	{
		System.out.println("youTube");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartTv  tv = new SmartTv();
		tv.internet();
		tv.youTube();
		
		Television t = new Television();
		t.switchOn();
		t.switchOff();
		t.channel();
		t.movie();
		Television tv12 = new SmartTv();
		tv12.movie();
	}

}
