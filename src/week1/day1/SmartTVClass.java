package week1.day1;
public class SmartTVClass 
{
//variables
protected int channelCount;
String smartTVName;
public long modelNumber;

//methods
public void volumeUp(int increaseVolume)
{
System.out.println("Volume increased by:"+ increaseVolume);
}
void volumeDown(int decreaseVolume)
{
System.out.println("Volume decreased by:"+decreaseVolume);
}
protected void onOff(String onOff)
{
System.out.println("Power is:"+onOff);
}
}