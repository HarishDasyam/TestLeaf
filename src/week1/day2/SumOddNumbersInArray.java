package week1.day2;

import java.util.Scanner;

public class SumOddNumbersInArray 
{
public static void main(String[] args)
{
int total=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of the array");
int arraySize = sc.nextInt();
System.out.println("Enter the array elements");
int numbersInArray[] = new int[arraySize];
for(int i=0;i<numbersInArray.length;i++)
{
numbersInArray[i] = sc.nextInt();	
}
for(int i:numbersInArray)
{
if(i%2!=0)
{
total=total+i;
}
}
System.out.println("Total is:"+total);
sc.close();
}
}