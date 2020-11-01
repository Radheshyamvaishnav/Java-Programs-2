//Java program to print reverse of the string.

import java.util.Scanner;
class prog10
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in); 
int i;
String str,res="";
System.out.println("ENTER THE STRING:");
str=scan.nextLine();
System.out.print("REVERSED STRING IS: ");
for(i=str.length()-1;i>=0;i--)
 {
  res=res+str.charAt(i);
 }
System.out.print(res);
}
}
