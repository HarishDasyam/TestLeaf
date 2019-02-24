package week1.day2;
public class OddIndextoUpperCase
{
public static void main(String[] args)
{
String  str ="testleaf";
//char c[] = str.toCharArray();
for(int i = 0;i<(str.length()-1);i++)
  {
	  if((i%2)==0)
	  {
		  str.toUpperCase();
	  }
  }
System.out.println(str);
}}