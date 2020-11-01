import java.util.Scanner;  
class pro16 
{ 
    public static void main(String args[]) 
    {   
	Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("ENTER THE VALUE OF a : ");
	a=scan.nextInt();
        System.out.print("ENTER THE VALUE OF b : ");
	b=scan.nextInt();
        System.out.print("ENTER THE VALUE OF c : ");
	c=scan.nextInt(); 
        if(a>=b && a>=c)
	{
	System.out.println("Largest number is====>" +a);
	}
	else if(b>=a && b>=c)
	{
	System.out.println("Largest number is====>" +b);
	}
	else
	{
	System.out.println("Largest number is====>" +c);
	}   
 } 
} 