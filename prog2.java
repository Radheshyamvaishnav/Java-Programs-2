//Java program to print table of integer number.

import java.util.Scanner;
class prog2
{
public static void main(String a[])
{
int k,j,i=0;
Scanner scan=new Scanner(System.in);
System.out.println("ENETR THE INTEGER NUMBER:");
j=scan.nextInt();
System.out.println("TABLE IS:");

for(i=0;i<=10;i++)
{
  k=j*i;
  System.out.println(j+" * "+i+" = "+k);
}
}
}