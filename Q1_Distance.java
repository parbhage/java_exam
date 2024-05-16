
import java.lang.Math;

import java.util.Scanner;

public class Q1_Distance{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the x-coordinates of point 1: ");
		int point1x = in.nextInt();
		
		System.out.print("Enter the y-coordinates of point 1: ");
		int point1y = in.nextInt();
		
		System.out.print("Enter the x-coordinates of point 2: ");
		int point2x = in.nextInt();
		
		System.out.print("Enter the y-coordinates of point 2: ");
		int point2y = in.nextInt();
		
		double distance = Math.sqrt((point2x-point1x)*(point2x-point1x)+(point2y-point1y)*(point2y-point1y));

		System.out.println(distance);
		
	}
	
	
}