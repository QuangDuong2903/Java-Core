package input_output;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		int a, b;
		String name;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên của bạn: ");
		name = scanner.nextLine();
		System.out.println("Xin chào " + name);
		System.out.print("Nhập a: ");
		a = scanner.nextInt();
		System.out.print("Nhập b: ");
		b = scanner.nextInt();
		System.out.println("a+b=" + (a + b) + "\na-b=" + (a - b));
	}

}
