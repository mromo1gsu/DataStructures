package lab1;

public class Fibonacci {

	public static void main(String[] args) {
		int N = 10;
		System.out.println("fibonacci(" + N + ") is " +
			recursiveFibonacci(N) + " (recursively)");
		System.out.println("fibonacci(" + N + ") is " +
			iterativeFibonacci(N) + " (non-recursively)");
	}

	private static int recursiveFibonacci(int k) {
		if (k < 0) {
			return -1;
		}
		else if (k == 0 || k==1) {
			return 1;
		}
		else {
			return recursiveFibonacci(k-1) + recursiveFibonacci(k-2);
		}
	}
	
	public static int iterativeFibonacci(int k) {
		if (k < 0) {
			return -1;
		}
		else if (k == 0 || k==1) {
			return 1;
		}
		else {
			int previousNumber = 0;
			int nextNumber = 1;
			
			for (int i = 1; i <= k; i++) {
				int sum = previousNumber + nextNumber;
				previousNumber = nextNumber;
				nextNumber = sum;
			}
			return nextNumber;
		}
	}

}
