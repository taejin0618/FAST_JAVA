package ch02;


public class Order {

    public int orderId;
    String buyerId;
    String sellerId;
    int productId;
    String orderDate;

    public void show() {
        System.out.println(orderId + "는" + buyerId + "입니다");
    }
}


