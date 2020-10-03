public class CityRegisterValidator {
    String hostName;

    AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running: " + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
