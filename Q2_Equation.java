import java.util.Scanner;

public class Q2_Equation{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = in.nextInt();
		
		System.out.print("Enter b: ");
		int b = in.nextInt();
		
		System.out.print("Enter c: ");
		int c = in.nextInt();
		
		System.out.print("Enter d:  ");
		int d = in.nextInt();
		
		System.out.print("Enter m:  ");
		int m = in.nextInt();
		
		System.out.print("Enter n:  ");
		int n = in.nextInt();
		
		if((a*d - b*c) == 0){
		
		System.out.println("Cannot be evaluated. Please enter another value of a/b/c/d..");
		
		}
		else{
			int x1 = (m*d - b*n)/(a*d - b*c);
			System.out.println("x1=" + x1);
			
			int x2 = (n*a - m*c)/(a*d - b*c);
			System.out.println("x2=" + x2);
		}
		
		
		
	}
	
	
}