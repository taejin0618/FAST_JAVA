package ch14;

public class TestStudent {
    String studentName;
    int money;

    public TestStudent(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(TestBus Testbus){
        Testbus.testtake(100);
        this.money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }
    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }

}
