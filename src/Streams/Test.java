package Streams;
import java.util.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		
		marks.add(10);
		marks.add(15);
		marks.add(5);
		marks.add(25);
		marks.add(30);
		marks.add(45);
		marks.add(20);
		
		System.out.println(marks);
		
		List<Integer> s = marks.stream()
				  .map(i->i+5)
				  .collect(Collectors.toList());
		 
		System.out.println(s); 
		  
		long noOfObject = marks.stream()
						.filter(m-> m<20)
						.count();
			System.out.println(noOfObject);
			
			List<Integer> sortedCollection = marks.stream()
											.sorted()
											.collect(Collectors.toList());
			
			System.out.println(sortedCollection);
			
			List<Integer> sortedCollectionDesc = marks.stream()
					.sorted((m1,m2) -> (m1<m2)?1:(m2<m1)?-1:0)
					.collect(Collectors.toList());

			System.out.println(sortedCollectionDesc);
			
	}
 
}
