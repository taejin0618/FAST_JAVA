package ch02;

public class Tvtest {
    public static void main(String[] args) {
        TV t = new TV();
        t.ch = 9;
        t.vo = "11";
        t.show();

        member mem = new member();
        mem.userId = "43";
        mem.address = "서울";
        mem.show();

    }

}
