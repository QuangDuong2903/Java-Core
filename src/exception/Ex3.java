package exception;

public class Ex3 {
	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			throw new CustomException("This is My error Message");
		} catch (CustomException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}
}