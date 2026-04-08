package builder;

import java.lang.reflect.Field;

// for fun

public class ReflectionPrinter {

    public static void printObject(Object obj) {
        Class<?> clazz = obj.getClass();
        System.out.println("---- " + clazz.getSimpleName() + " ----");


        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true); // 🔥 access private fields
            try {
                Object value = field.get(obj);
                System.out.println(field.getName() + " = " + value);
            } catch (IllegalAccessException e) {
                System.out.println(field.getName() + " = [ACCESS ERROR]");
            }
        }

        System.out.println("------------------------");
    }
}