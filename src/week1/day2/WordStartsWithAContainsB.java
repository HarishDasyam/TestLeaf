package week1.day2;
public class WordStartsWithAContainsB 
{
public static void main(String[] dd)
{
String str = "babu abhi ram gopi sarath";
String split [] = str.split(" ");
int splitLength = split.length;
for(int i=0;i<(splitLength-1);i++)
{
if(split[i].startsWith("a"))
{
	if(split[i].contains("b"))
	{
		System.out.println(split[i]);
	}
}
}
}
}