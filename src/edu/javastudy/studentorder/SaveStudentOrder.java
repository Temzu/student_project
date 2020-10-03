package edu.javastudy.studentorder;

import edu.javastudy.studentorder.domain.Adult;
import edu.javastudy.studentorder.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();
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

    static StudentOrder buildStudentOrder() {
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Паша");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);
        return so;
    }
}
