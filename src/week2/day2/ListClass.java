package week2.day2;

import java.util.ArrayList;
import java.util.List;

public class ListClass 
{
public static void main(String[] args)
{
List<String> li = new ArrayList<>();
li.add("Bahubali");
li.add("Srimanthudu");
li.add("102 notout");
li.add("Bahubali");
li.add("Bahubali");
li.add("Srimanthudu");
int count = 0;
for (String string : li) 
{
if(string.contains("Bahubali"))
{
count++;
}
}
System.out.println(count);
}
}