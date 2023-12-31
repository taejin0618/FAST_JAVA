package ch04;

import java.util.Scanner;

public class TestSamdla {
    public static void main(String[] args) {
        SamDal jindal = new SamDal();

        Scanner scanner = new Scanner(System.in);
        String phone;
        phone = scanner.nextLine();
        jindal.name = "samdal";
        jindal.phone = phone;
        jindal.add = "은평구";

        jindal.show();
    }


}
