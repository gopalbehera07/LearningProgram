package LogicalOperatorValidator;

public class UserRegistration {
	 public static boolean isValidInput(boolean isValid, boolean meetsCondition) {
	        return isValid && meetsCondition;
	    }

	    public static void main(String[] args) {
	        boolean isValid = true;
	        boolean meetsCondition = true;

	        boolean isInputValid = isValidInput(isValid, meetsCondition);

	        System.out.println("Is input valid (true/false): " + isInputValid);

	        if (isInputValid) {
	            System.out.println("Input is valid.");
	        } else {
	            System.out.println("Input is not valid.");
	        }
	    }
}
