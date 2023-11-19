package ch06;

public class StudentTest {

	public static void main(String[] args) {

		//Student studentLee = new Student();

		Student studentLee = new Student(12345, "Lee", 3);

		String data = studentLee.showStudentInfo();
		System.out.println(data);

		Student studentKim = new Student(141, "KIM", 1);
		String data1  = studentKim.showStudentInfo();
		System.out.println(data1);
	}

}
