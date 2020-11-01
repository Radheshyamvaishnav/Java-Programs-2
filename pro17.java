import java.util.Scanner;  
class pro17 
{ 
    public static void main(String args[]) 
    {   
	Scanner scan=new Scanner(System.in);
        float a,b,c;
        System.out.print("Enter the Amount of per unit : ");
	a=scan.nextInt();
        System.out.print("How many units is used in this month: ");
	b=scan.nextInt();
	c=a*b;
	System.out.print("YOU HAVE TO PAY RUPEES:-  "+c);       
     } 
} 