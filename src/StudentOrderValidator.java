public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        StudentOrder so = readStudentOrder();

        if (so == null) {
            return;
        }

        AnswerCityRegister citiAnswer = checkCityRegister(so);
        AnswerMarriage marriageAnswer = checkMarriage(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerMarriage checkMarriage(StudentOrder so) {
        AnswerMarriage ans = new AnswerMarriage();
        System.out.println("Marriage запущен");
        return ans;
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        AnswerChildren ans = new AnswerChildren();
        System.out.println("Children Check is running");
        return ans;
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        AnswerStudent ans = new AnswerStudent();
        System.out.println("Студенты проверяются");
        return ans;
    }

    static void sendMail(StudentOrder so) {
        System.out.println("Почта отправлена");
    }
}
