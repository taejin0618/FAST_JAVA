package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentID = 202310;
        studentLee.studentName = "이순신";
        studentLee.address = "서울";


        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentID = 202210;
        studentKim.studentName = "김유신";
        studentKim.address = "경주";

        studentKim.showStudentInfo();

        Student studentpark = new Student();
        studentpark.studentID = 2022046;
        studentpark.studentName = "김태진";
        studentpark.address = "서울";
        studentpark.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);
        System.out.println(studentpark);


    }

}
