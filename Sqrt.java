//Implement square root function that returns 
//square root of given number.
//Compute and return the square root of x, where x 
//is guaranteed to be a non-negative integer.
//Since the return type is an integer, the decimal digits 
//are truncated and only the integer part of the result is returned.
package SquareRoot;
import java.util.*;

public class Sqrt {	
	    public static int mySqrt(int x) {
	        long low = 0, high = x, res = 0;

	        while (low <= high) {
	            long mid = (low + high) / 2;
	            long mulMid = mid * mid;

	            if (mulMid == x)
	                return ((int) mid);
	            if (mulMid > x) {
	                high = mid - 1;
	            } else {
	                low = mid + 1;
	                res = mid;
	            }
	        }
	        return ((int) res);
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        System.out.print(mySqrt(x));
	        sc.close();
	    }
}
