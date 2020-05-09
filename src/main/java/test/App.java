package test;

import java.lang.reflect.Field;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws InterruptedException, NoSuchFieldException, IllegalAccessException {
        Class<Test> clazz = Test.class;
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getFields()));
        System.out.println(Arrays.toString(clazz.getConstructors()));
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println(Arrays.toString(clazz.getAnnotations()));

        Field field = clazz.getField("myField");
        Test t = new Test();
        field.set(t, "sdffds");
        System.out.println(t.myField);


    }
}
