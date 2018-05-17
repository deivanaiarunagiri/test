package DevPackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		@SuppressWarnings("rawtypes")
		Class c = Class.forName("DevPackage.Test");
		Test t = (Test) c.newInstance();

		Method m;
		try {
			m = c.getDeclaredMethod("Show", null);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m.setAccessible(true);
		try {
			m.invoke(t, null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
