public class Staticvariable 
{
int age;
static int count; 
Staticvariable(int a)
{
age=a;
count ++;
}
public void babyAge() 
{
	System.out.println("baby age is : " + age);
}
public static void main(String[] args) 
{
	Staticvariable test1=new Staticvariable(8);
	test1.babyAge();
	Staticvariable test2=new Staticvariable(9);
	test2.babyAge();
	Staticvariable test3=new Staticvariable(10);
	test3.babyAge();
	System.out.println("the total objects of a class created are: " + count);
	}
}
