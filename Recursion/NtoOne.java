import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int num = 5;
		System.out.println(NtoOne(num));
	}
	
	private static int NtoOne(int num){
	    if(num == 1) return 1;
	    System.out.println(num);
	    return (NtoOne(num - 1));
	}
}
