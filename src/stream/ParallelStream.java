package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParallelStream {

	public static List<Integer> createList() {
		List<Integer> result = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 1000000; i++)
			result.add(random.nextInt(1000000));
		return result;
	}

	public static void main(String[] args) {
		List<Integer> l1 = createList();
		List<Integer> l2 = createList();
		long startTime = System.nanoTime();
		l1.stream().sorted((s1, s2) -> s1 - s2);
		long endTime = System.nanoTime();
		System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
		startTime = System.nanoTime();
		l2.parallelStream().sorted((s1, s2) -> s1 - s2);
		endTime = System.nanoTime();
		System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
	}

}