package reflection;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {

	private String name;
	private String password;
	private int age;
	private List<Integer> tasks = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Integer> getTasks() {
		return tasks;
	}
	public void setTasks(List<Integer> tasks) {
		this.tasks = tasks;
	}
	
	public UserDTO() {
		
	}
	
	public UserDTO(String name, String password, int age, List<Integer> tasks) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.tasks = tasks;
	}
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", password=" + password + ", age=" + age + ", tasks=" + tasks + "]";
	}
}
