package ch12;


public class TestPerson {
    String name;
    int age;

    public TestPerson() {
        this("이름없음", 2);
    }

    public TestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
    public TestPerson getPerson(){
        return this;
    }
    public static void main(String[] args) {
        TestPerson Person = new TestPerson();
//        Person.name = "이름 없음";
//        Person.age = 1;

        Person.show();
        System.out.println(Person);

    }
}
