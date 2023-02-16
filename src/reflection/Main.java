package reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException {
//		for (Method getMethod : User.class.getMethods()) {
//			if (getMethod.getName().startsWith("get") && !getMethod.getName().contains("Class"))
//				System.out.println(getMethod.invoke(user));
//		}
//		for (Method getMethod : User.class.getMethods()) {
//			if (getMethod.getName().startsWith("get") && !getMethod.getName().contains("Class"))
//				for (Method setMethod : UserDTO.class.getMethods())
//					if (setMethod.getName().startsWith("set") && setMethod.getName().substring(3).equals(getMethod.getName().substring(3))) {
//						//System.out.println(setMethod.getName());
//						setMethod.invoke(dto, getMethod.invoke(user));
//						break;
//					}
//		}
//		User user = new User("quangduong", "123456", 19, Arrays.asList(1, 2, 3, 4, 5));
//		UserDTO dto = new UserDTO();
//		Mapper mapper = new Mapper();
//		dto = mapper.converter(user, UserDTO.class);
		User user = new User();
		UserDTO dto = new UserDTO("quangduong", "123456", 19, Arrays.asList(1, 2, 3, 4, 5));
		Mapper mapper = new Mapper();
		user = mapper.converter(dto, User.class);
		System.out.println(user);
		System.out.println(dto);
	}
}
