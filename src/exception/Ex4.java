package exception;

public class Ex4 {
	
	public void checkProduct(int weight) throws CustomException {
		if(weight < 10)
			throw new CustomException("Invalid product");
		System.out.println("Valid product");
	}
	
	public static void main(String[] args) {
		Ex4 obj = new Ex4();
		try {
			obj.checkProduct(9);
		} catch (CustomException e) {
			System.out.println("In catch block");
			System.out.println(e);
		}
	}
}
