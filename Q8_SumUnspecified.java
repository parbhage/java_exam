import java.util.Scanner;

public class Q8_SumUnspecified{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(true){
			System.out.print("To Calculate Sum Press 1/ To Exit Press 0:");
			int press = in.nextInt();
		
			if(press==1){
				System.out.print("Enter a number 1: ");
				int num1= in.nextInt();
			
				System.out.print("Enter a number 2: ");
				int num2= in.nextInt();
				
				int sum = num1+num2;
				System.out.println("Sum of Numbers is "+sum);
			}
			else
				break;
	
	}
	
	}	
}