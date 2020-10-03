package edu.javastudy.studentorder;

import edu.javastudy.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        
        saveStudentOrder();
    }

    static void saveStudentOrder() {
        System.out.println("saveStudentOrder");
    }

    static void scheduleStudentOrder() {
        System.out.println("Schedule student is running");
    }

    static void sendFinanceStudentOrder() {

    }
}
