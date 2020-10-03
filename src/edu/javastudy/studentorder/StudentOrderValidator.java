package edu.javastudy.studentorder;

import edu.javastudy.studentorder.domain.*;
import edu.javastudy.studentorder.mail.MailSender;
import edu.javastudy.studentorder.validator.ChildrenValidator;
import edu.javastudy.studentorder.validator.CityRegisterValidator;
import edu.javastudy.studentorder.validator.MarriageValidator;
import edu.javastudy.studentorder.validator.StudentValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        while (true) {
            StudentOrder so = readStudentOrder();
            if (so == null) {
                break;
            }
            AnswerCityRegister citiAnswer = checkCityRegister(so);
            if (!citiAnswer.success) {
                //continue;
                break;
            }
            AnswerMarriage marriageAnswer = checkMarriage(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);
            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv = new CityRegisterValidator();
        AnswerCityRegister ans = crv.checkCityRegister(so);
        return ans;
    }

    static AnswerMarriage checkMarriage(StudentOrder so) {
        return MarriageValidator.checkMarriage(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        return ChildrenValidator.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        return StudentValidator.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);
    }
}
