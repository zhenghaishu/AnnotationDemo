package com.java.annotation;

@MyAnnotationClass(msg = "这是一个类注解")

public class MyAnnotationDemo {
    public MyAnnotationDemo() {
    }

    public MyAnnotationDemo(String text) {
        this.text = text;
    }

    @MyAnnotationMethod(common = "这是一个方法注解")

    public void method() {
//        System.out.println(text);
    }

    @MyAnnotationField(request = true)

    private String text;
}