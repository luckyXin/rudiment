package dx.web.common;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {

		Constructor<?> constructor = ReflectionObject.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		ReflectionObject reflectionObject = (ReflectionObject) constructor.newInstance();
		
		for(Method method : ReflectionObject.class.getDeclaredMethods()) {  
			method.setAccessible(true);
			if (method.getName().equals("systemOutPrint")) {
				method.invoke(reflectionObject);     
				
			} else if (method.getName().equals("sum")){
				int str = (Integer) method.invoke(reflectionObject, 2, 3);
				System.out.println(str);
			}
		}
	}

}
