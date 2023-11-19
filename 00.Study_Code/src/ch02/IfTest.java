package ch02;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요:");
        num = s.nextInt();

        if (num < 10) {
            System.out.println("10 미만 입니다.");

        } else if (num > 10) {
            System.out.println("10 이상 입니다");

        }


    }
}
