package week2.day2;
public class StringOccurence
{
public static void main(String dd[])
{
String str = "Harish Dasyam";int count;
char ch[]= str.toCharArray();
char ch12[] = str.toCharArray();
for (int i=0;i<ch.length;i++)
{count =0;
	for(int j=0; j<ch12.length;j++)
	{
		
		if(ch[i]==(ch[j]))
		{
		count++;
		}
	}System.out.println(ch[i]+" occurs"+count+" times");
}
}
}