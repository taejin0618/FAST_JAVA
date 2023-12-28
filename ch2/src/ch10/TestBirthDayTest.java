package ch10;

public class TestBirthDayTest {
    public static void main(String[] args) {
        TestBirthDay date = new TestBirthDay();

        date.setyear(2019);
        date.setMonth(12);
        date.setDay(30);

        date.showDate();
    }
}
