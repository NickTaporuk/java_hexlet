package com.hexlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hexlet.common.Course;
import com.hexlet.humans.Student;
import com.hexlet.humans.Human;
import com.hexlet.humans.ExempleFieldClass;

public class Main {

    public static void main(String[] args) throws IOException{
/*
        Student studentNick = new Student();
        Human human  = new Human();
        studentNick.name    = "Nick Taporuk";
        studentNick.age     = 28;
        studentNick.course.name = "Java course";
        studentNick.sayHello();
        human.setName("Nick");
        System.out.println(human.getName());
*/
        ExempleFieldClass exmp = new ExempleFieldClass();
        exmp.nonStaticField = 4;
        exmp.StaticField = 6;

        ExempleFieldClass exmp1 = new ExempleFieldClass();
        exmp1.nonStaticField = 5;
        exmp1.StaticField = 7;

        System.out.println("1:"+exmp.nonStaticField+"\n2:"+exmp1.nonStaticField+"\n"+exmp1.StaticField+"\n"+exmp.StaticField+"\n");

    }
}
