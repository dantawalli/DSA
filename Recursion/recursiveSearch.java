import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] array = {10,20,30,40,50,60,70,80,90};
		System.out.println(recursiveSearch(array, 0, array.length - 1, 100));
	}
	
	private static boolean recursiveSearch(int[] arr, int left, int right, int x){
	    if(left > right){
	        return false;
	    }
	    if(arr[left]==x){
	        return true;
	    }
	    else if(arr[right] == x){
	        return true;
	    }
	   return recursiveSearch(arr, left + 1, right - 1, x);
	}
}
