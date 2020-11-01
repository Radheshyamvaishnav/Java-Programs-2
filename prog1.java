//Java program to print used different characters (letters) in a string
import java.util.Scanner;
class prog1
{
public static void main(String args[])
{
		
	String str, s;
	int i;
	char c;			
	Scanner scan=new Scanner(System.in);
	System.out.print("ENTER THE STRING:");
	str=scan.nextLine();
	s=str.toLowerCase();
	System.out.println("USED CHARACTERS IN THE STRINGS ARE:-");
	for( c='a'; c<='z';c++)
	{
	for(i=0;i<s.length();i++)
	{
	if(c==s.charAt(i))
	{
	System.out.print(c + " ");
	break;
	}
	}
	}
}
}