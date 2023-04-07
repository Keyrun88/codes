package CodingRound.Java;

import java.util.Arrays;

public class ArrayFrequency {

	public static void main(String[] args) {
		 int arr [] = new int [] {10,15,20,30,10,15,30,10,15,30,15,10,30,30,30,10,};
		 
		 countFrequency(arr);
	}

	 public static void countFrequency(int a[]) {
		 
		 Arrays.sort(a);
		 
		 int i = 0;
		 for(i=0; i<a.length-1; ++i) {
			  
			 int count = 1;
			 
			 while(( i<a.length -1)&& a[i]== a[i+1]) {
				 
				 ++count;
				 ++i;
			 }
			 
			 System.out.println(a[i] + ": " + count);
			 
			 //count++;
			 
		 }
		 
	 }
}
