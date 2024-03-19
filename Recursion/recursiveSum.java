import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int num = 12345;
		System.out.println("The result of sum of " + num + " is: " + recursiveSum(num));
	}
	
	private static int recursiveSum(int num){
	    if(num == 0) return 0;
	    return (num % 10 + recursiveSum(num / 10));
	}
}
