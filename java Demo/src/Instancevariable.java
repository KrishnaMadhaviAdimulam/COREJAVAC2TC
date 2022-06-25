public class Instancevariable 
{
	int age;
	Instancevariable(int a)
	{ 
		age=a;
	}
	public void babyAge() 
	{
		System.out.println("baby age is : " + age);
	
     }
	public static void main(String[] args)
	{
		Instancevariable test=new Instancevariable(8);
		test.babyAge();
	}
}
