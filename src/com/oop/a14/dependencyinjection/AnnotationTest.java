package com.oop.a14.dependencyinjection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {
    @Injection(which = Car.class)
    public static Drivable car;
    @Injection(which = Tractor.class)
    public static Drivable tractor;

    @SuppressWarnings({"unused", "rawtypes","unchecked"})
    public static void main(String[] args) throws Exception{
        Class test = AnnotationTest.class;
        Field[] fields = test.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Injection) {
                    Injection injection = (Injection) annotation;
                    Class clazz = injection.which();
                    Object obj = clazz.getDeclaredConstructor().newInstance();
                    if (obj instanceof Car) {
                        Car car = (Car) obj;
                        System.out.println(car.start());
                    }
                }
            }
        }
    }
}
