import java.util.Scanner;

public class Q3_BMI{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your weight(pound): ");
		double weight_pound = in.nextDouble();
		
		System.out.print("Enter your height(inches): ");
		double height_inch = in.nextDouble();
		
		double weight_kg = weight_pound*0.45359237;
		double height_m = height_inch*0.0254;
		
		double bmi=weight_kg/(height_m*height_m);
		
		if(bmi<16)
			System.out.println("You are seriously underweight.");
		
		else if(bmi>=16 && bmi<18)
			System.out.println("You are underweight.");
		
		else if(bmi>=18 && bmi<24)
			System.out.println("Your weight is normal.");
		
		else if(bmi>=24 && bmi<29)
			System.out.println("You are overweight.");
		
		else if(bmi>=29 && bmi<=35)
			System.out.println("You are seriously overweight.");
		
		else if(bmi>35)
			System.out.println("You are gravely overweight.");
		
	}
	
	
}