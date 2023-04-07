package CodingRound.Java;

public class Greatest {

	public static void gretest(int num ,int num2) {
		
		if(num==num2) System.out.println("both are equal");
		int temp = num>num2 ?num:num2;
		System.out.println(temp +" is greter");
		
		  System.out.println(Math.max(num, num2) + " is greater");
	}
	
	
	public static void gretestBetweenThreeNumber(int num1,int num2,int num3)
	{

	     int temp, result;    
	    
	    // find the largest b/w num1 and num2 & store in temp
	    temp = num1>num2 ? num1:num2;
	    
	    // find the largest b/w temp and num3 & finally printing it
	    result = temp>num3 ? temp:num3;  
	    System.out.println (result + " is the greatest");
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gretest(451,254);
		gretestBetweenThreeNumber(145,523,689);
		
		
}
}