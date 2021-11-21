package com.school_management_system;

import java.util.*;
/**
 * Many Teachers, Many Students
 * Implements tecahers and students using array list
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static long totalMoneyEarned;
    private static long totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of the teachers
     * @param students list of the students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * adds a student to the school
     * @param student add the student into the list
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public long getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * adds the total money earned by the school
     * @param moneyEarned money that is suppose to be added
     */
    public static void updateTotalMoneyEarned(long moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public long getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money spent by the school which
     * is the teachers salary
     * @param moneySpent the money spent by the school
     */
    public static void updateTotalMoneySpent(long moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
