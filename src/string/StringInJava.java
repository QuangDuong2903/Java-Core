package string;

public class StringInJava {
	public static void main(String[] args) {
		String a = new String("Quang Dương");
		String b = "Quang dương";
		String c = a.concat(b);
		System.out.println(a + "\n" + a.length());
		System.out.println(c);
		System.out.println(a.charAt(0));
		if (a.compareTo(b) == 0)
			System.out.println("2 string is equal");
		if (a.compareToIgnoreCase(b) == 0)
			System.out.println("2 string is equal");
		System.out.println(a.indexOf("n"));
		System.out.println(a.lastIndexOf("n"));
		System.out.println(a.replace('a', 'o'));
		System.out.println(a.trim());
		System.out.println(a.substring(a.indexOf(" ") + 1));
	}
}