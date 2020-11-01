//JAva prog to print all student details.
import java.util.Scanner;
public class prog6
{ 
public static void main(String args[])
{ 
Scanner scan=new Scanner(System.in);
String name;
int age,rollno;
System.out.print("ENTER THE STUDENT NAME: ");
name=scan.nextLine();
System.out.print("ENTER THE ROLL NO: ");
rollno=scan.nextInt();
System.out.print("ENTER THE AGE: ");
age=scan.nextInt();
System.out.println("NAME OF STUDENT IS "+name);
System.out.println("ROLL NO OF STUDENT IS "+rollno);
System.out.println("AGE OF STUDENT IS "+ age);


}
}