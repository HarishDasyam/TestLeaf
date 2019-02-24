package week1.day2;
public class CountOfAinWord
{
public static void main(String dd[])
{
	String str = "Amazon India Private Limited";
	char chArray[] = str.toCharArray();
	int count=0;
	for(int i=0;i<(chArray.length)-1;i++)
	{
		if(chArray[i]=='a'||chArray[i]=='A')
		{
		count++;	
		}
	}
	System.out.println(count);
}
}