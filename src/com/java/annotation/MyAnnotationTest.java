
package com.java.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyAnnotationTest {
    public static void main(String[] args) {
        MyAnnotationDemo demo = new MyAnnotationDemo("hello rollen");
        MyAnnotationClass annotationClass = demo.getClass().getAnnotation(MyAnnotationClass.class);
        System.out.println(annotationClass.msg());
        
        Method method = null;
        try {
            method = demo.getClass().getMethod("method",new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        MyAnnotationMethod annotationMethod = method.getAnnotation(MyAnnotationMethod.class);
        System.out.println(annotationMethod.common());
        
        Field field = null;
        try {
            field = demo.getClass().getDeclaredField("text");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        MyAnnotationField annotationField = field.getAnnotation(MyAnnotationField.class);
        System.out.println(annotationField.request());
    }
}
