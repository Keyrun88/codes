package CodingRound.Java;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		//using third variable
		System.out.println("before swap  " +a);
		System.out.println("before swap  " +b);
		
		//int t;

//			t = a;
//			a = b;
//			b = t;
//
//		System.out.println("after swap  " +a);
//		System.out.println("after swap  " +b);
//		
//		//without third variable using + operator
//		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		System.out.println("after swap  " +a);
//		System.out.println("after swap  " +b);
//		
//		//without third variable using * operator
//		a = a*b;
//		b = a/b;
//		a = a/b;
//		
//		System.out.println("after swap  " +a);
//		System.out.println("after swap  " +b);
//		
//		
		//without third variable using xor operator


		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("after swap  " +a);
		System.out.println("after swap  " +b);
		


	}

	}
