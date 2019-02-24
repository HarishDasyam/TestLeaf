package week1.day2;
public class LocalInstanceConstructor
{
int i;//This is an instance variable as it is stored outside main function
public void method()
{
int j=44;// This is local variable as it is defined inside a method
System.out.println(i);//Here, i will print zero even though there is no value assigned to it
System.out.println(j);//j must be initalised or else it will through an error stating that local variable
//must be initialized
}
public LocalInstanceConstructor()//This is a default constructor
{
System.out.println("I am constructor");
}
public static void main(String dd[])
{
LocalInstanceConstructor lo = new LocalInstanceConstructor();
lo.method();
//i++; i cannot be called directly, it can be called directly only when it is defined as Static
}
}