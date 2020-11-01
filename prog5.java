//JAva prog to print all prime numbers form 1 to n.
import java.util.Scanner;
public class prog5
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in);
int i,n,k;
System.out.println("ENTER THE NUMBER:");
k=scan.nextInt();
if(k<=1)
{
System.out.println("PLEASE ENTER VALID NUMBER:");
}
else
for (n=2; n<=k; n++)
        {
            boolean isPrime = true;
            for (i=2; i <= n/2; i++)
            {
                if ( n % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(n);
        }
    }
}