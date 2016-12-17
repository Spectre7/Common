package corsojavagenesis.common.reflection;

import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) {
		A a = new A();
		
		Class c = a.getClass();
		
		Method[] m = c.getMethods();
		
		
	}

}
