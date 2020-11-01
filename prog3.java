//Java program count the number of divisor.
import java.util.Scanner;
class prog3
{
public static void main(String a[])
{
int i,j,k=0;
Scanner scan=new Scanner(System.in);
System.out.println("ENTER THE INTEGER NUMBER:");
j=scan.nextInt();
for (i = 1; i <=j; i++)
{
if (j % i == 0) 
 {
   k++;
 }
}
System.out.print("Total Number Of Divisor Are: "+k);
}
}