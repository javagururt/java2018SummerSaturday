package com.javaguru.lesson9;

import java.util.ArrayList;
import java.util.List;

class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        student.learn();

        juniorDeveloper.learn();
        juniorDeveloper.writeCode();

        middleDeveloper.learn();
        middleDeveloper.writeCode();
        middleDeveloper.debugCode();

        seniorDeveloper.learn();
        seniorDeveloper.writeCode();
        seniorDeveloper.debugCode();
        seniorDeveloper.solveProblem();

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(juniorDeveloper);
        students.add(middleDeveloper);
        students.add(seniorDeveloper);

        Student secondStudent = new SeniorDeveloper();

        students.add(secondStudent);

        System.out.println();

        for (int i = 0; i < students.size(); i++) {
            students.get(i).learn();
        }
    }
}
