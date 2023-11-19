package ch03;

public class FunctionTest {

    public static int addNum(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHollo(String greeting) {
        System.out.println(greeting);
    }


    public static int calcSum() {
        int sum = 0;
        int i;
        for (i = 0; i <= 100; i++) {
            sum += i;

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(addNum(10, 20));
        sayHollo("하이");
        int sum = calcSum();
        System.out.println(sum);
        System.out.println(addNum(5,6));
    }
}
