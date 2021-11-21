package com.school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher lizzy = new Teacher(101,"Lizzy",750);
        Teacher mellisa = new Teacher(102,"Mellisa", 850);
        Teacher abhijeet = new Teacher(103,"Abhijeet",950);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(abhijeet);

        Student anush = new Student(1001,"Anush",10);
        Student abhay = new Student(1002,"Abhay",10);
        Student ananthu = new Student(1003,"Ananthu",10);
        Student arjun = new Student(1004,"Arjun",10);

        List<Student> studentList = new ArrayList<>();
        studentList.add(anush);
        studentList.add(abhay);
        studentList.add(ananthu);
        studentList.add(arjun);

        School KV_ONGC = new School(teacherList,studentList);

        anush.payFees(1000);
        abhay.payFees(1000);

        System.out.println("$" + KV_ONGC.getTotalMoneyEarned());

        System.out.println("----Making KV_ONGC pay Salary---");

        abhijeet.receiveSalary(abhijeet.getSalary());
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("KV_ONGC has spent salary for $" + abhijeet.getSalary() +" & $"+ lizzy.getSalary()
                + " and now has $" + KV_ONGC.getTotalMoneyEarned());

        System.out.println(abhay);
    }
}
