//Java prog for calculation of CGPA
import java.util.Scanner;  
class pro20
{
	public static void main(String arg[])	
	{
	Scanner scan=new Scanner(System.in);
        int m1,m2,m3,m4,m5,tm;
	System.out.print("Enter the marks of physics  : ");
	m1=scan.nextInt();
	System.out.print("Enterthe marks of geometry  : ");
	m2=scan.nextInt();
	System.out.print("Enter the marks of algebra  : ");
	m3=scan.nextInt();	
	System.out.print("Enter the marks of history  : ");
	m4=scan.nextInt();	
	System.out.print("Enter the marks of geography: ");
	m5=scan.nextInt();
	tm=((m1+m2+m3+m4+m5)*100)/500;
	if(tm>=0 && tm<=10)
	{
	System.out.print("YOUR CGPA IS 1");
	}
        else if(tm>=11 && tm<=20)
	{
	System.out.print("YOUR CGPA IS 2");
	}
        else if(tm>=21 && tm<=30)
	{
	System.out.print("YOUR CGPA IS 3");
	}
        else if(tm>=31 && tm<=40)
	{
	System.out.print("YOUR CGPA IS 4");
	}
        else if(tm>=41 && tm<=50)
	{
	System.out.print("YOUR CGPA IS 5");
	}
        else if(tm>=51 && tm<=60)
	{
	System.out.print("YOUR CGPA IS 6");
	}
        else if(tm>=61 && tm<=70)
	{
	System.out.print("YOUR CGPA IS 7");
	}
        else if(tm>=71 && tm<=80)
	{
	System.out.print("YOUR CGPA IS 8");
	}
        else if(tm>=81 && tm<=90)
	{
	System.out.print("YOUR CGPA IS 9");
	}
        else
	{
	System.out.print("YOUR CGPA IS 10");
	}    
	}
} 