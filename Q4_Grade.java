import java.util.Scanner;

public class Q4_Grade{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your marks in English: ");
		int marks = in.nextInt();
		
		int grade = marks/10;
		
		switch(grade){
			case 10:
				System.out.print("Grade: Outstanding");
				break;
			case 9:
				System.out.print("Grade: Excellent");
				break;
			case 8:
				System.out.print("Grade: Very Good");
				break;
			case 7:
				System.out.print("Grade: Good");
				break;
			case 6:
				System.out.print("Grade: Satisfactory");
				break;
			case 5:
				System.out.print("Grade: Bad");
				break;
			case 4:
				System.out.print("Grade: Very Bad");
				break;
			default:
				System.out.print("Grade: Fail");
		}
		
		
		
		
	}
	
	
}