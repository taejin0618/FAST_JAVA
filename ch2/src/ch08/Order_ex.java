package ch08;

public class Order_ex {
    public String orderNumber;
    public String orderPhone;
    public String orderAddress;
    public String orderyear;
    public String orderTime;
    public String orderPrice;
    public String menuNumber;

    public void showdetali() {

        System.out.println("주문 접수 번호: " + orderNumber);
        System.out.println("주문 핸드폰 번호: " + orderPhone);
        System.out.println("주문 집 주소: " + orderAddress);
        System.out.println("주문 날짜: " + orderyear);
        System.out.println("주문 시간: " + orderTime);
        System.out.println("주문 가격: " + orderPrice);
        System.out.println("주문 번호: " + menuNumber);

    }

}


