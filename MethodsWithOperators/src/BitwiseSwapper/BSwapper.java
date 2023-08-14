package BitwiseSwapper;

public class BSwapper {
	 public static void swapUsingBitwise(int first, int second) {
	        System.out.println("Before swapping: First = " + first + ", Second = " + second);

	        // Swapping using bitwise XOR
	        first = first ^ second;
	        second = first ^ second;
	        first = first ^ second;

	        System.out.println("After swapping: First = " + first + ", Second = " + second);
	    }

	    public static void main(String[] args) {
	        // Input the integers to be swapped
	        int firstInput = 5;
	        int secondInput = 8;

	        // Call the swapUsingBitwise method to swap the values
	        swapUsingBitwise(firstInput, secondInput);
	    }
}
