import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int n = 7;
	    int k = 3;
	    System.out.println(josephus(n,k));
	}
	
	private static int josephus(int n, int k){
	    if(n == 1){
	        return 1;
	    }
	    return (josephus(n-1, k) + k - 1) % n + 1;
	}
}
