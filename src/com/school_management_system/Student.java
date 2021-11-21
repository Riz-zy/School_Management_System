package com.school_management_system;

// this class is responsible for keeping track of students and
// their information
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    /*
    To create new student
    id for the student : unique id
    name of the student
    grade of the student
    Fees for every student is going to be $1500
    Fees paid initially is 0
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFees = 1500;
    }

    //Not going to alter student's ID

    /**
     * Used to update student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to the feesPaid Field/Variable
     * Add the fees to the fees paid
     * The school will receive the funds
     * @param fees the fees that the student paid
     */
    public void payFees(int fees) {
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getTotalFees() {
        return totalFees;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return totalFees - feesPaid;
    }

    @Override
    public String toString(){
        return "Student name : " + name + ". Total fees paid : " + feesPaid;
    }
}
