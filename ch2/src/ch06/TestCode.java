package ch06;

public class TestCode {
    public static void main(String[] args) {
        test kim = new test();
        kim.studentName = "김태진";
        kim.studentNumber = 1234;
        kim.grade = 123;
        System.out.println(kim.showStudentInfot());

        test studentkim = new test(1234, "kim", 3);
        System.out.println(studentkim.showStudentInfot());
    }
}