package CodingRound.Java;
import java.util.Arrays;

public class FindLargerSmallerNumber {
	public static void main(String []args) {
	
		int []numbers = {-10,-20,100,50,80,70,120,65};
		
		int larger =0;
		int smaller =0;
		for(int i=0;i<numbers.length;++i) {
			
			
			if(larger<numbers[i])
				
				larger = numbers[i];
			else if(smaller>numbers[i]){
				smaller = numbers[i];
			}
			
		}
		System.out.println("given array  is :: " +Arrays.toString(numbers)); 
		System.out.println("larger no is :: " +larger);
		System.out.println("smaller no is :: " +smaller);
		
		
	}

		
	}


