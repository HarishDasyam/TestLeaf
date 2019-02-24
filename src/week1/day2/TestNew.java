package week1.day2;
public class TestNew
{
public static void main(String dd[])
{
	int sum=0;
	String htr = "444375";
	char[] ch = htr.toCharArray();
	int l = ch.length;
	for(int i=0;i<l;i++)
	{
		if(ch[i]%2!=0)
		{
			sum=sum+Integer.parseInt(Character.toString(ch[i]));
		}
	}System.out.println(sum);
}
}