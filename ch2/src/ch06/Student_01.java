package ch06;

import ch04.Student;

public class Student_01 {
    public int studentNumber;
    public String studentName;
    public int grade;

    public int studentNamering;

    public Student_01(){}
    public Student_01(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " +
                grade
                + "학년 입니다";
    }
}