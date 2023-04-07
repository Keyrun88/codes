package CodingRound.Java;

public class SumOfDigit {
	
	public static void sumOfDigit(int num) {
		int sum=0;
		while(num!=0) {
			sum += num%10;
			num /= num/10;
			
		}
		
		System.out.println("sum of digit : " +sum);
	}  
	   static int getSum (int num)
	   {

	     if (num == 0)
	       return 0;

	     return (num % 10) + getSum (num / 10);
	   }
	   
	public static void main(String[] args) {
		
		sumOfDigit(75849);
		System.out.println("the sum is : " +getSum(7589));
	}

}
