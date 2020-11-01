//Java program to count total number of words in strings.

import java.util.Scanner;
public class prog4
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in);
String str; 
int i,n = 1;
System.out.println("ENTER THE STRING:");
str=scan.nextLine();
for (i=0; i < str.length()-1; i++)
{
if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
{
n++;
}
}
System.out.print("NUMBRE OF WORDS ARE :");
System.out.print(n);
}
}
