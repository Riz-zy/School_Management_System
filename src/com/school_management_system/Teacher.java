package com.school_management_system;

/**
 * This class is responsible for keeping the
 * track of the teachers information
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates new Teacher object
     * @param id id for the Teacher
     * @param name name of the Teacher
     * @param salary salary of the Teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the ID and
     * @return return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the Name and
     * @return returns name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the salary and
     * @return returns the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * set the salary of the teacher
     * @param salary of the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * adds to the salary
     * removes from the total money earned bye the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }
}
