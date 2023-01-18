package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		int width = 10;
		Drawable drawable = () -> {
			System.out.println("Drawing " + width);
		};
		drawable.draw();

		Speakable speakable = () -> {
			return "I can speak";
		};
		System.out.println(speakable.speak());

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		Collections.sort(list, (s1, s2) -> s1 - s2);
		list.forEach((a) -> System.out.println(a));
	}
}
