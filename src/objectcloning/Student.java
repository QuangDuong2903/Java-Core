package objectcloning;

public class Student implements Cloneable {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student anotherStudent = (Student) obj;
			if (anotherStudent.getAge() == this.age && anotherStudent.getName().equals(this.name))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student a = new Student("qd", 18);
		Student b = a;
		Student c = (Student) a.clone();
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a == b);
		System.out.println(a == c);
	}
}
