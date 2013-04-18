package refect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RelectTest {
	public static void main(String[] args){
		//String className = "java.util.Date";
		String className = "java.lang.Double";
		try {
			Class clazz = Class.forName(className);
			Class superClazz = clazz.getSuperclass();
			String modifiers = Modifier.toString(clazz.getModifiers());
			if (modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.print(" class " + className);
			if (superClazz != null && superClazz != Object.class){
				System.out.print(" extends " + superClazz.getName());
			}
			System.out.println("{");
			System.out.println();
			printConstrucors(clazz);
			System.out.println();
			printMethods(clazz);
			System.out.println();
			//printFields();
			System.out.println();
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void printMethods(Class cl){
		Method[] methods = cl.getDeclaredMethods();
		for( Method m : methods){
			Class retureType = m.getReturnType();
			System.out.print(retureType);
			String name = m.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(m.getModifiers()); 
			if (modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.print(name + "(");
			Class[] paraTypes = m.getParameterTypes();
			for( int i = 0; i < paraTypes.length; i++){
				if (i > 0){
					System.out.print(",");
				}
				System.out.print(paraTypes[i].getName());
				
			}
			System.out.println(");");
		}
	}
	public static void printConstrucors(Class cl){
		Constructor[] constructors = cl.getDeclaredConstructors();
		for(Constructor c:constructors){
			String name = c.getName();
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.print(name + " (");
			Class[] paraTypes = c.getParameterTypes();
			for( int i = 0; i < paraTypes.length; i++){
				if (i > 0){
					System.out.print(",");
				}
				System.out.print(paraTypes[i].getName());
				
			}
			System.out.println(" );");
			
		}
	}
	
	
}
