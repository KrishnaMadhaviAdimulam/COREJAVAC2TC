public class Operators 
{
	public static void main(String[] args)
	{
      int a=3;
      int b=5;
      int c=7;
      System.out.println(a++);//(3)4
      System.out.println(++b);//6
      System.out.println(c--);//(7)6
      System.out.println(--c);//5
      c=a+b;
      System.out.println(c);//Arithmetic operator
      boolean p=c>b;
      System.out.println(p);//Relational operator
      System.out.println(a>b&&b>c);//logical operator
      System.out.println(a^b);//bitwise operator
      System.out.println(a<b?a:b);//conditional operator
      a+=4;//a=a+4
      System.out.println(a);//Assignment operator
      System.out.println(a>>b);//shift operator                       
	}
	
}
		
 
	
