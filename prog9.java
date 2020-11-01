//Java program to print reverse of the number

import java.util.Scanner;
class prog9
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in); 
int i=0,n,res=0;
System.out.println("ENTER THE NUMBER:");
n=scan.nextInt();
System.out.print("REVERSED NUMBER IS: ");
while(n>0)
 {
  res=(res*10)+(n%10);
  n=n/10;
 }
System.out.print(res);
}
}
