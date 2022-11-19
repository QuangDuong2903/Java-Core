package exception;

public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errMessage;

	public CustomException(String errMessage) {
		this.errMessage = errMessage;
	}

	@Override
	public String toString() {
		return ("MyException Occurred: " + errMessage);
	}
}
