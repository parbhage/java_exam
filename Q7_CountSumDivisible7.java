

public class Q7_CountSumDivisible7{
	public static void main(String[] args){
		
		int count = 0;
		int sum = 0;
		
		
		for(int i=100; i<201; i++){
			if(i%7 == 0){
				count++;
				sum = sum+i;
			}
				
		
		}
		System.out.println("Count of Numbers Divisible by 7 is "+count);
		System.out.println("Sum of Numbers Divisible by 7 is "+sum);
		
		
	}
	
	
}