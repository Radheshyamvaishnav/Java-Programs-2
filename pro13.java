/*Java program for fibonacci series*/
import java.util.Scanner;
class pro13
{
public static void main(String a[])
 {
 int e=0,f=1,g,h,i;
 Scanner scan=new Scanner(System.in);
 System.out.println("ENTER THE LAST NUMBER: ");
 g=scan.nextInt();
System.out.println("FIBONACCI SERIES IS====>");
System.out.println(e);
 for(i=2;i<=g;++i)
 {
 h=e+f;
 System.out.println(h);
 e=f;
 f=h;
 }
 }
}
 