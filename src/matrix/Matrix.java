package matrix;

import java.util.Scanner;

public class Matrix {

	private static Scanner scanner = new Scanner(System.in);

	public static void CreateArray(int[][] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = scanner.nextInt();
	}

	public static void PrintArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		int n, m;
		System.out.print("Nhập số số dòng: ");
		n = scanner.nextInt();
		System.out.print("Nhập số cột: ");
		m = scanner.nextInt();
		int[][] array = new int[n][m];
		CreateArray(array);
		PrintArray(array);
	}

}
