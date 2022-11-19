package exception;

public class Ex2 {
	
	public static void checkEligibilty(int age,int weight) {
		if(age < 12 || weight < 40)
			throw new ArithmeticException("Student is not eligible for registration");
		else 
	         System.out.println("Student Entry is Valid!!"); 
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Registration process!!");
	     checkEligibilty(12, 39); 
	     System.out.println("Have a nice day.."); 
	}
}
