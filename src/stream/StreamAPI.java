package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.stream().skip(1) // discard 1 first element
				.limit(3) // limit 3 element in result
				.forEach(System.out::println);

		List<String> strings = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
		strings.stream().map(String::toUpperCase).forEach(System.out::println);

		list.stream().sorted((s1, s2) -> s2 - s1).forEach(System.out::println);

		List<String> result = strings.stream().filter(t -> t.contains("J")).collect(Collectors.toList());
		result.forEach(System.out::println);

		System.out.println(strings.stream().filter(t -> t.contains("J")).count());

		System.out.println(strings.stream().anyMatch(s -> s.equalsIgnoreCase("jAVa"))); // true
		System.out.println(strings.stream().allMatch(s -> s.equalsIgnoreCase("jAVa"))); // false
		System.out.println(list.stream().allMatch(s -> s > 0)); // true
		System.out.println(list.stream().noneMatch(s -> s == 0)); // true

		System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get()); // 5
		System.out.println(list.stream().min(Integer::compareTo).get()); // 1
		System.out.println(list.stream().min((s1, s2) -> s1 - s2).get()); // 1

		System.out.println(list.stream().reduce(0, (s1, s2) -> s1 + s2)); //15
	}

}
