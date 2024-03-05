import java.io.*;

class GFG {
	public static void main (String[] args) {
	    String word = "abc";
	    int index = 0;
	    String curr = "";
	   powerSet(word, index, curr);
	}
	
	
	private static void powerSet(String word, int index, String curr){
	    
	    int n = word.length();
	    
	    if(index == n){
	        System.out.println(curr);
	        return;
	    }
	    
	    powerSet(word, index + 1, curr + word.charAt(index));
	    powerSet(word, index + 1, curr);
	}
}
