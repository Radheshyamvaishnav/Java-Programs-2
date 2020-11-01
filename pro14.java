/*Java program for simple interest*/
import java.util.Scanner;
class pro14
{
public static void main(String a[])
 {
  Scanner scan=new Scanner(System.in);
  int p,r,n,si;
  System.out.print("Enter principal amount: ");
  p=scan.nextInt();
  System.out.print("Enter rate of interest: ");
  r=scan.nextInt();
  System.out.print("Enter number of years: ");
  n=scan.nextInt();
  si=(p*r*n)/100;
  System.out.print("Simple interest is "+si);
 
 }
}
 