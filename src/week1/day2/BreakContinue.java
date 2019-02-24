package week1.day2;
public class BreakContinue
{
public static void main(String dd[])
{
int i=3;
System.out.println("Break");
for(int j=1;j<10;j++)
{
if(j%i==0)
break;
System.out.println(j);
}
System.out.println("Continue");
for(int j=1;j<10;j++)
{
if(j%i==0)
continue;
System.out.println(j);
}
}
}