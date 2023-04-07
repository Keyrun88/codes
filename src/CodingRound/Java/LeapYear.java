package CodingRound.Java;

public class LeapYear {
	
	public static void isLeapYear(int year) {
		
	    
	     int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
	    if (flag ==1)
	    {
	        System.out.println (year + " is a Leap Year");
	    }
	    else
	    {
	         System.out.println (year + " is not a Leap Year");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isLeapYear(1999);
		isLeapYear(2000);
		isLeapYear(2001);
		isLeapYear(2004);
}
}
