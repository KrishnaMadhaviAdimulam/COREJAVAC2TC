
public class SwitchCaseInt 
{
	public static void main(String[]args) 
	{
		int p = 12;
		if(p==1)
		{
			System.out.println("p value is 1");
		}
		else if(p==2) 
		{
			System.out.println("p value is 2");	
		}
		else if(p==3) 
		{
			System.out.println("p value is 3");
		}
		else 
		{
			System.out.println("p value is other than 1,2,3");
		}
		switch(p) 
		{
		case 1:
			System.out.println("value of p is 1");
			break;
		case 2:
			System.out.println(" value of p is 2");
			break;
		case 3:
			System.out.println("value of p is 3");
			break;
		default:
			System.out.println("value of p is other than 1,2,3");
			break;
		}
	}
}
