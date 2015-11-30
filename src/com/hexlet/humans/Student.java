package com.hexlet.humans;

import com.hexlet.common.Course;
public class Student {

    public String name = "N/A";
    public int age = 15;
    public Course course = new Course() ;

    public void sayHello() {
        System.out.println("Hello1111");
        System.out.println("My name is"+name);
        course.aboutCourse();
    }
}
