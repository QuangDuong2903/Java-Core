package collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListImpl {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Iterator<Integer> iterator = list.iterator();

		System.out.println("\nHiển thị phần tử sử dụng ListIterator: ");
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.print("\nPhần tử có chỉ số 2 trong list là: " + list.get(2));

		int index, value;
		System.out.print("\nNhập index phần tử muốn chỉnh sửa: ");
		index = scanner.nextInt();
		System.out.print("\nNhập giá trị muốn chỉnh sửa: ");
		value = scanner.nextInt();
		list.set(index, value);

		System.out.println("\nList sau khi chỉnh sửa: ");
		iterator = list.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.print("\nNhập phần tử muốn xóa: ");
		value = scanner.nextInt();
		list.remove(value);

		System.out.println("Các phần tử của list sau khi xóa: ");
		for (int i : list)
			System.out.print(i + " ");

		System.out.print("\nNhập phần tử muốn tìm: ");
		value = scanner.nextInt();
		if (list.contains(value))
			System.out.println("Tồn tại, vị trí: " + list.indexOf(value));
		else
			System.out.println("Không tồn tại");

		Collections.sort(list);
		System.out.println("Các phần tử của list sau khi sắp xếp: ");
		for (int i : list)
			System.out.print(i + " ");
	}

}
