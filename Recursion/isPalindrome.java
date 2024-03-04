import java.io.*;

class GFG {
	public static void main (String[] args) {
		//String word = "malayalam";
	      String word = "buhari";
		int n = word.length();
		System.out.println(isPalindrome(word, 0, n- 1));
	}
	
	private static boolean isPalindrome(String word, int left, int right){
	    if(left < right){
	        if(word.charAt(left) != word.charAt(right)){
	            return false;
	        }else{
	            return true;
	        }
	    }
	    return isPalindrome(word, left + 1, right - 1); 
	}
}
