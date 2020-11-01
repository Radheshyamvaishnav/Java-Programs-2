//Java program to print reverse of the number

import java.util.Scanner;
class pro11
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in); 
int m,i=0,n,res=0;
System.out.println("ENTER THE NUMBER:");
n=scan.nextInt();
m=n;
System.out.print("REVERSED NUMBER IS:-  ");
while(n>0)
 {
  res=(res*10)+(n%10);
  n=n/10;
 }
System.out.print(res);
if(m==res)
{
System.out.print("----->THIS STRING Is A PALINDROME.");
}
else
{
System.out.print("----->THIS STRING Is NOT A PALINDROME.");
}
}
}
