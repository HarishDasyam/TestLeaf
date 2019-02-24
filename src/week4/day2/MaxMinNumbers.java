package week4.day2;
public class MaxMinNumbers
{
public static void main(String hd[])
{
int a[]= {11,13,3,7,18,8,9};
int j,greaterValue=0,smallerValue=0;
for(int i=0;i<a.length;i++)
{
	for(j=0;j<a.length;)
	{
		if(a[i]>=a[j])
		{
		j++;
		}
		greaterValue=a[j];
	} System.out.println(greaterValue+"HD");
}
for(int i=0;i<a.length;i++)
{
	for(j=0;j<a.length;)
	{
		if(a[i]<=a[j])
		{
		j++;
		}
		smallerValue=a[j];
	} System.out.println(smallerValue+"HD");
}
}
}