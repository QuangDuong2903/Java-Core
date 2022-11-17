package array;

import java.util.Scanner;

public class Array {

	private static Scanner scanner = new Scanner(System.in);

	public static void CreateArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = scanner.nextInt();
	}

	public static void PrintArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int n;
		System.out.print("Nhập số lượng phần tử trong mảng: ");
		n = scanner.nextInt();
		int[] array = new int[n];
		CreateArray(array);
		PrintArray(array);
	}
}
