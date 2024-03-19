import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n = 10;
		System.out.println(factorial(n, 1));
	}
	
	private static int factorial(int n, int a){
	    if(n == 0) return a;
	    return factorial(n - 1, n * a);
	}
}
