//java prog for sum of digits of number.
import java.util.Scanner;  
class pro18 
{ 
    public static void main(String args[]) 
    {   
	Scanner scan=new Scanner(System.in);
        int i,n,m=0;
        System.out.print("Enter the number : ");
	n=scan.nextInt();
	while(n>0)
	{
	i=n%10;
        m=m + i;
	n=n/10;
	}
	System.out.print("SUM OF DIGITS OF NUMBER IS:-  "+m);       
     } 
} 