package CodingRound.Java;

public class ReverseSentence {
	


 public static String reverseSentence(String str){
		
		String [] sentence = str.split(" ");
		String str1 = "";
		
		for(int i=sentence.length-1; i>=0;--i){
			if(i==0){
			str1 = str1 + sentence[i];
			}
			else{
			str1 = str1 + sentence[i] + " " ;
		}
		    
		}
			
		    return str1;
		}
		
	public static void main(String [] args){
	
		String str = "Always believe something wonderful is about to happen";
		
		System.out.println(reverseSentence(str));
		
		
}


}



