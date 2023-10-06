public class FindOddBP {
	public static int findIt(int[] A) {
  	int xor = 0;
    for (int i = 0; i < A.length; i++) {
    	xor ^= A[i];
    }
    return xor;
  }
}