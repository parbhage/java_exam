import java.util.Scanner;

public class Q5_Prime{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int flag = 1;
		
		for(int i=2; i<num; i++){
			if (num%i == 0){
				flag=0;	
				break;
			}
		
		}
		if(flag == 0)
			System.out.print(num+" is not a Prime Number.");
		
		else
		System.out.print(num+" is a Prime Number.");
		
	}
	
}