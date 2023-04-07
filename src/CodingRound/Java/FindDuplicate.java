package CodingRound.Java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		Integer names [] = {4,4,1,3,4};
		
		//by comparing each element
//		int i;
//		int j;
//		 for(i=0;i<names.length;++i) {
//			 for(j=i+1;j<names.length;++j) {
//				 
//				 if(names[i].equals(names[j])) 
//					 System.out.println("the duplicate value is :: " +names[j]);
//			 }
//		 }
		 //by using hash set 
		 Set<Integer> store = new HashSet<>();
		  int count = 1;
		 for(Integer name:names) {
			  
			 if(store.add(name)==false) {
			 System.out.println("the duplicate value is :: " +name);
				 ++count;
			
		 }
			
		 }
		 
		 System.out.println(count);
	}

} 
