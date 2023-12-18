package ch06;

public class test {
    public int studentNumber;
    public String studentName;
    public int grade;

    public test(){}
    public test(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }


    public String showStudentInfot() {

        return studentName + "학생의 학번은" + studentNumber + "이고 " + grade + "학년 입니다.";
    }
}
