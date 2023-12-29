package ch09;

public class TestStudent {
    int studentId;      // 학생 ID
    String studentName; // 학생 이름

    Subject korea; // 국어 과목
    Subject math;  // 수학 과목

    TestStudent(){}
    TestStudent(int studentId, String studentName) { // 생성자
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject(); // 국어 객체 생성
        math = new Subject();  // 수학 객체 생성
    }

    public void setKoreaSubject(String name, int score) { // 국어 과목 설정 메서드
        korea.subjectName = name; // 과목 이름 설정
        korea.score = score;       // 점수 설정
    }

    public void setMathSubject(String name, int score) { // 수학 과목 설정 메서드
        math.subjectName = name; // 과목 이름 설정
        math.score = score;       // 점수 설정
    }

    public void showScoreInof() { // 학생의 총점 출력 메서드
        int total = korea.score + math.score; // 국어와 수학 점수를 합산하여 총점 계산
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다."); // 총점 출력
    }
}
