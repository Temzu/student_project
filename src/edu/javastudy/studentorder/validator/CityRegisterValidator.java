package edu.javastudy.studentorder.validator;

import edu.javastudy.studentorder.domain.AnswerCityRegister;
import edu.javastudy.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    String hostName;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running: " + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
