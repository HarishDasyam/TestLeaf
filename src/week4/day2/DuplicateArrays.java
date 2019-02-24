package week4.day2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class DuplicateArrays 
{
public static void main(String ar[])
{
	int a[] = {1 ,3 ,3 ,7, 8, 8, 8,9};
	int count;
	List<Integer> li = new ArrayList<>();
	for(int i=0;i<a.length;i++)
		{
		li.add(a[i]);
		}
	Set<Integer> sh = new HashSet<>();
	for(int i=0;i<a.length;i++)
	{
	sh.add(a[i]);
	}
	System.out.println(sh);
	for (int i=0;i<a.length;i++)
	{
		count = 0;
		//System.out.println(a[i]);
		for(int j=0; j<a.length;j++)
		{
			if(a[i]==a[j])
			{
			count++;
			}
		}
		if(count>1)
		{
		System.out.print(a[i]);	
		}
	}
}
}