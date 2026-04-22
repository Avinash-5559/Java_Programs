package J12_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Cal cal = new Cal();
        System.out.println("\nRegular Method Call       : " + cal.add(10, 20));

        // Gets the Class object representing Cal class
        Class<?> clazz = Cal.class;

        /*
            clazz contains metadata about Cal class:
            - Class name
            - Package
            - All methods
            - All fields
            - Constructors
        */

        // Calling private variable outside the class
        Field x = clazz.getDeclaredField("x");
        x.setAccessible(true);
        System.out.println("\nPrivate Variable call     : " + x.getInt(cal));

        // Calling method demo()
        Method method1 = clazz.getMethod("demo");
        method1.invoke(cal);

        // Calling add method dynamically
        Method method2 = clazz.getMethod("add", int.class, int.class);
        int result = (int) method2.invoke(cal, 10, 40);
        System.out.println("\nMethod Called Dynamically : " + result);

        // Calling static method hello()
        Method method3 = clazz.getMethod("hello");
        method3.invoke(null);

    }
}