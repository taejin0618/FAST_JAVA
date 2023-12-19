package ch09;

public class TestSub {
    public static void main(String[] args) {
        // 학생 Lee의 정보 설정
        TestStudent studentlee = new TestStudent(100, "Lee");
        studentlee.setKoreaSubject("국어", 100); // Lee의 국어 과목 점수 설정
        studentlee.setMathSubject("수학", 99);   // Lee의 수학 과목 점수 설정

        // 학생 Kim의 정보 설정
        TestStudent studentkim = new TestStudent(200, "Kim");
        studentkim.setKoreaSubject("국어", 90); // Kim의 국어 과목 점수 설정
        studentkim.setMathSubject("수학", 80);  // Kim의 수학 과목 점수 설정

        studentlee.showScoreInof(); // Lee의 총점 출력
        studentkim.showScoreInof(); // Kim의 총점 출력
    }
}
