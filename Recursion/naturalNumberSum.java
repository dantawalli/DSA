class GFG {
	public static void main (String[] args) {
	    int num = 5;
		System.out.println("The result of sum number of " + num + " is: " + naturalNumberSum(num));
	}
	
	private static int naturalNumberSum(int num){
	    if(num <= 1) return 1;
	    return num + naturalNumberSum(num - 1);
	}
}
