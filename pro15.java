import java.util.Scanner;  
class pro15 
{ 
    public static void main(String args[]) 
    {   
	Scanner scan=new Scanner(System.in);
        double p, r, t,ci;
	System.out.println("ENTER THE VALUES ::");
        System.out.print("PRINCIPLE AMOUNT : ");
	p=scan.nextInt();
        System.out.print("RATE OF INTEREST : ");
	r=scan.nextInt();
        System.out.print("TIME:");
	t=scan.nextInt(); 
        ci = p*(Math.pow((1 + r/ 100),t)); 
        System.out.println("Compound Interest is "+ ci); 
    } 
} 