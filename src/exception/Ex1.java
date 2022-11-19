package exception;

public class Ex1 {
	public static void main(String[] args) {
		int a = 1, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Chạy dù có exception");
		}
	}
}
