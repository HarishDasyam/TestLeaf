package week1.day2;

import java.util.Scanner;

public class DynamicValuesForEachPrint 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int arraySize[] = new int[4];
for(int i=0;i<arraySize.length;i++)
{
arraySize[i] = sc.nextInt();	
}
for(int i:arraySize)
{
System.out.println(i);
}
sc.close();
}
}