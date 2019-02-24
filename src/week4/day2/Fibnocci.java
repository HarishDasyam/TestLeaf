package week4.day2;
public class Fibnocci
{
public static void main(String hd[])
{
int i=1,j=0;
do
{
i=i+j;
j=i-j;
System.out.print("\t"+i);
}while(i<50);
}
}