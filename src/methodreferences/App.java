package methodreferences;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void print(int a) {
		System.out.println(a);
	}
	
	public void say() {
		System.out.println("Speaking");
	}
	
	public static void speak() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		list.forEach(App::print);
		list.forEach(System.out::println);
		Sayable sayable1 = new App()::say;
		Sayable sayable2 = App::speak;
		sayable1.say();
		sayable2.say();
	}
}
