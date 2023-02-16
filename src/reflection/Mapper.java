package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mapper {

	public <T, V> V converter(T source, Class<V> targetClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		V target = targetClass.getConstructor().newInstance();
		for (Method getMethod : source.getClass().getMethods()) {
			if (getMethod.getName().startsWith("get") && !getMethod.getName().contains("Class"))
				for (Method setMethod : target.getClass().getMethods())
					if (setMethod.getName().startsWith("set") && setMethod.getName().substring(3).equals(getMethod.getName().substring(3))) {
						setMethod.invoke(target, getMethod.invoke(source));
						break;
					}
		}
		return target;
	}
	
	public void name() {
		
	}

}
