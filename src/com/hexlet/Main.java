package com.hexlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hexlet.common.Course;
import com.hexlet.humans.Student;

public class Main {

    public static void main(String[] args) throws IOException{
        Student studentNick = new Student();

        studentNick.name    = "Nick Taporuk";
        studentNick.age     = 28;
        studentNick.course.name = "Java course";
        studentNick.sayHello();
    }
}
