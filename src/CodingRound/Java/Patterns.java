package CodingRound.Java;

public class Patterns{

	public static void main(String[] args) {
		
		int patternNo = 0;
		System.out.println("###################" + ++patternNo);
			for(int i =1;i<=5;++i) {
			
			for(int j =1;j<=i;++j) {
				
	 			System.out.print(j);
			}
			
			System.out.println(" "); 
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1; i<=5;++i) {
			
			for(int j = 1; j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("###################" + ++patternNo);
		
			for(int i =1;i<=5;++i) {
			
			for(int j =1;j<=i;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i =5;i>=1;--i) {
			
			for(int j =1;j<=i;++j) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i =5;i>=1;--i) {
			
			for(int j =1;j<=i;++j) {
				
				System.out.print(i);
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=5;i>=1;--i) {
			for(int j=1;j<=i;++j) {
				
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print(j);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print(i);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {	
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {
			for(int j=1;j<=2*i;++j) {
				
				System.out.print(j);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {
			for(int j=1;j<=2*i;++j) {
				
				System.out.print(i);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=4;++i) {
			for(int j=1;j<=2*i;++j) {
				
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=4;i>=1;--i) {
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print(j);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=4;i>=1;--i) {
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print(i);
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i=4;i>=1;--i) {
			for(int j=1;j<=2*i-1;++j) {
				
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("###################" + ++patternNo);
		
			for(int i =1;i<=5;++i) {
			
			for(int j =1;j<=i;++j) {
				
	 			System.out.print((char)(96+j));
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i =1;i<=5;++i) {
			
			for(int j =1;j<=i;++j) {
				
	 			System.out.print((char)(96+i));
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
		
					for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i;++j) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			
			for(int j=i; j>=1;--j) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");   
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i;++j) {
				
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<=i*2-1;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=5;i>=1;--i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			  
			for(int j=1; j<=i;++j) {
				
				System.out.print(j + " ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=5;i>=1;--i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			  
			for(int j=1; j<=i*2-1;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			  
			for(int j=1; j<=2*i-1;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=5;i>=1;--i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			  
			for(int j=1; j<=2*i-1    ;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			} 
			  
			for(int j=1; j<=2*i;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
		
			for(int i=5;i>=1;--i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			  
			for(int j=1; j<=2*i;++j) {
				
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("###################" + ++patternNo);
			
			for(int i=1;i<=5;++i) {
			
			for(int k=1; k<=5-i;++k) {
				
				System.out.print(" ");
			}
			
			for(int j=i; j>=1;--j) {
				
				System.out.print(j);
			}
			
			System.out.println(" ");   
		}
			System.out.println("###################" + ++patternNo);
			
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=5; j++) 
					System.out.print("*");
				System.out.println();
			}
			
			System.out.println("###################" + ++patternNo);
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=5; j++) 
					if((i==1 || i==5) || (j==1 || j==5))
						System.out.print("*");
					else
						System.out.print(" ");
				
				System.out.println();
				
			}
			
			System.out.println("###################" + ++patternNo);
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=8; j++) 
					if((i==1 || i==5/*row*/) || (j==1 || j==8/*col*/))
						System.out.print("*");
					else
						System.out.print(" ");
				
				System.out.println();
				
			}
			
			System.out.println("###################" + ++patternNo);
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=i-1; j++) 
				    	System.out.print(" ");
				for (int j = 1; j <=8; j++) 
					System.out.print("*");
				System.out.println();
			}
		}		

}
