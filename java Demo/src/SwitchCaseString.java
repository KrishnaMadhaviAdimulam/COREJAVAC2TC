public class SwitchCaseString 
{
	public static void main(String[]args) 
	{
		String name = "editor";
		switch(name.toLowerCase())
		{
		case "author":
			System.out.println("vikas");
			break;
		case "team":
			System.out.println("Team Java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("invalid entry");
			break;
		}
	}
}
