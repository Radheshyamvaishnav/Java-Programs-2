//Java program to print all odd numbers from 1 to n

import java.util.Scanner;
class prog7
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in); 
int i,n = 0;
System.out.println("ENTER THE INTEGER:");
n=scan.nextInt();
System.out.println("ODD NUMBERS ARE: ");
for (i=0;i<=n;i++)
{
if(i%2!=0)
 {
 System.out.println(i);
 }
}
}
}