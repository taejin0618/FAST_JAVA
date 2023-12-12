package ch08;


public class Order_ex_Test {
    public static void main(String[] args) {


        Order_ex kim = new Order_ex();

        kim.orderNumber = "202012345789";
        kim.orderPhone = "010-1234-4578";
        kim.orderAddress = "서울시 강남구 역삼동 111-333";
        kim.orderyear = "20201102";
        kim.orderTime = "130258";
        kim.orderPrice = "35000";
        kim.menuNumber = "0003";

        kim.showdetali();
    }


}
