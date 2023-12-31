package ch04;

public class SamDal {
    String name;
    String phone;
    String add;

    SamDal(){}
    SamDal(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public void show() {
        System.out.println(name + "은 이고" + phone + "은 이고" + add + " 입니다");
    }
}
