/*Java program for factorial*/
import java.util.Scanner;
class pro12
{
public static void main(String a[])
 {
 int f=1,n,i;
 Scanner scan=new Scanner(System.in);
 System.out.println("ENTER THE NUMBER TO FIND THE FACTORIAL");
 n=scan.nextInt();
 for(i=1;i<=n;i++)
 {
 f=f*i;
 }
System.out.print("FACTORIAL OF THIS NUMBER IS====>");
System.out.print(f);
 }
}
 