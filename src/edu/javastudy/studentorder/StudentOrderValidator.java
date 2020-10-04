package edu.javastudy.studentorder;

import edu.javastudy.studentorder.domain.*;
import edu.javastudy.studentorder.mail.MailSender;
import edu.javastudy.studentorder.validator.ChildrenValidator;
import edu.javastudy.studentorder.validator.CityRegisterValidator;
import edu.javastudy.studentorder.validator.MarriageValidator;
import edu.javastudy.studentorder.validator.StudentValidator;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterValidator;
    private MarriageValidator marriageValidator;
    private ChildrenValidator childrenValidator;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        marriageValidator = new MarriageValidator();
        childrenValidator = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();
    }

    public void checkAll() {
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

    public StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }

    public AnswerMarriage checkMarriage(StudentOrder so) {
        return marriageValidator.checkMarriage(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenValidator.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {
        return studentValidator.checkStudent(so);
    }

    public void sendMail(StudentOrder so) {
        mailSender.sendMail(so);
    }
}
