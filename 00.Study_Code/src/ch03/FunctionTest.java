package ch03;

public class FunctionTest {
    public static int totalSum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;

    }


    public static void sayhello(String greeting) {
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

        int total = calcSum();


        System.out.println(total); // num 함수 출력
    }
}


