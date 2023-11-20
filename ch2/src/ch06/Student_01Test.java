package ch06;

public class Student_01Test {
    public static void main(String[] args) {

        Student_01 studentLee = new Student_01();

        System.out.println(studentLee.showStudentInfo());

        Student_01 studentKim = new Student_01(1234, "kim", 3
        );
        System.out.println(studentKim.showStudentInfo());
    }
}
