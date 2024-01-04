package ch14;

public class TestBus {
    int busNumber;
    int passengerCount;
    int money;

    public TestBus(int busNumber) {
        this.busNumber = busNumber;
    }
    public void testtake(int money){
        this.money += money;
        passengerCount++;
    }
    public void showBusinfo(){
        System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + " 입니다");
    }
}
