package CodingRound.Java;

public class Singleton {
		
		private static Singleton singletonInstance = null;
	    static String str = null;
		 
		 
		
		private Singleton () 
		{
			
			str = "hey , i'm using singletone class patterm";
		}
		
		public static Singleton getSingleton() {
			
			if(singletonInstance == null)
				
			singletonInstance = new Singleton();
			return singletonInstance;
				
	}
		public static void main(String[] args) {
			
			Singleton a = Singleton.getSingleton();
			Singleton b = Singleton.getSingleton();
			Singleton c= Singleton.getSingleton();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
}
