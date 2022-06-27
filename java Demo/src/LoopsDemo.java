public class LoopsDemo 
{
	public static void main(String[]args) 
	{
		//for loop
		for(int i=1,j=1;i<10||j<10;i++,j++)
		{
			j++;
			System.out.println("i="+i+"and j="+j);
		}
		//while loop
		int i=1,j=1;
		while(i<10||j<10)
		{
			i++;j++;
			System.out.println("i="+i+"and j="+j);
		}
		//do while loop
		int I=1,J=1;
		do 
		{
			I++;
			J++;
			System.out.println("I="+I+"and J="+J);
		}
		while(I<10||J<10);
	
		}
	}

