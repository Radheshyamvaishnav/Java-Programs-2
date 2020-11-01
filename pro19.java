//java prog for depreciation of machinery.
import java.util.Scanner;  
class pro19
{
	public static void main(String arg[])	
	{
	Scanner scan=new Scanner(System.in);
        long amt,dep,yr,n;
	System.out.print("Enter the amount of machinery.: ");
	amt=scan.nextLong();
	System.out.print("Enter the depercent : ");
	dep=scan.nextLong();
	System.out.print("Enter the year : ");
	yr=scan.nextLong();	
	n=amt;
	for(int i=0;i<yr;i++)
	n=((100-dep)*n)/100;
	System.out.println("DEPRIACIATION= "+n);
	
	    
	}
} 